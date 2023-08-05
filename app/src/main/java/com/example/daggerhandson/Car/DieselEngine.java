package com.example.daggerhandson.Car;

import android.util.Log;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Override
    public void start() {
        Log.d(TAG, "starting diesel engine");
    }
}
