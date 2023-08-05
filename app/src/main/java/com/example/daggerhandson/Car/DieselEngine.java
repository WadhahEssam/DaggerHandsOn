package com.example.daggerhandson.Car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower; // we want this field to be populated at run time (when we inject the Car in MainActivity)

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "starting diesel engine. HorsePower:  " + horsePower);
    }
}
