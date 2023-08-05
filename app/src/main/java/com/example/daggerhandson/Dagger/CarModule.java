package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.Rims;
import com.example.daggerhandson.Car.Tires;
import com.example.daggerhandson.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class CarModule { // if all of your module providers are static, you should make the module class abstract (to remove the deprecated message).

    // This is just to tell dagger how to instanciate objects for unaccessable constructors like rims (we pretended like its unaccessable)
    @Provides
    static Rims provideRims() { // you can always make the module providers static if they don't require any field from the module (for better performance)
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        // dagger already know how to create rims and tires from the previous module providers.
        return new Wheels(rims, tires);
    }
}
