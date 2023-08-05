package com.example.daggerhandson.Car;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    // if you would like to swap this module to be diesel instead of petrol you will have to
    // change the modules = {} of the main car module (of course you cannot support both)
    @Binds
    abstract  Engine bindsDieselEngine(DieselEngine dieselEngine);
}
