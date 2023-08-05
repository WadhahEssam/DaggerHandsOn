package com.example.daggerhandson.Car;

import javax.inject.Inject;

// This class represents a third party class (that we cannot just simply inject), thus we will need to create a constructor for it
public class Wheels {
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}