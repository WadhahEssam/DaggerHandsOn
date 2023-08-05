package com.example.daggerhandson.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine; // also you can mark those as @Inject, and they will be instanciated after constructor, constructor -> fields -> methods
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // dagger will run this automatically after the car is created
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this); // this is the only case where you need method injection (where you pass the injected object itself into the dependency) => because the object is not created)
        // you cant run this inside of the constructor because it needs an instance of it self, hmmmm got it
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving ...");
    }
}

// field and method automatic injection will happen only when your constructor is marked as @inject, this is whey we have to inject manually in the MainActivity.
