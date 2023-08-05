package com.example.daggerhandson.Car;

import android.util.Log;

// This class represents a third party class (that we cannot just simply inject), thus we will need to create a constructor for it
public class Tires {
    private static final String TAG = "Car";
    public Tires() {
    }
    public void inflate() {
        Log.d(TAG, "inflating the tires"); 
    }
}
