package com.example.daggerhandson.Car;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract  class PetrolEngineModule {
    @Binds // binds does the exact same thing as Provides but it is used when you bind the creation of a subclass for a super class.
    // you use this when you want to bind an implementation to an interface. you should use this way, since its much more performant
    // you are just telling dagger to use Petrol engine for constructing an object that implements the Engine interface.
    // of course you have to provide a way for dagger to create the petrol engine too either by @inject or by adding it in the module here.
     abstract  Engine bindEngine(PetrolEngine engine);
}
