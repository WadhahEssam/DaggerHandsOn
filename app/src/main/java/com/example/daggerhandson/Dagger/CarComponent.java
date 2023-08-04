package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.Car;

import dagger.Component;

@Component
public interface CarComponent {
   Car getCar();
}
