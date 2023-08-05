package com.example.daggerhandson.Car;

import android.util.Log;

import javax.inject.Inject;

// since the car is going to be created with an object that implements the Engine class, we should add a module to specify which engine
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "starting petrol engine");
    }
}
