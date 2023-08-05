package com.example.daggerhandson.Car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

// since the car is going to be created with an object that implements the Engine class, we should add a module to specify which engine
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;


    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "starting petrol engine, HorsePower " + horsePower + " EngineCapacity " + engineCapacity);
    }
}
