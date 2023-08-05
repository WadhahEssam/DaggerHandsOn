package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.DieselEngine;
import com.example.daggerhandson.Car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    // if you would like to swap this module to be diesel instead of petrol you will have to
    // change the modules = {} of the main car module (of course you cannot support both)
    // if you add them both you will get a run time error (Engine is bound multiple times)
    @Binds
    abstract Engine bindsDieselEngine(DieselEngine dieselEngine);
}
