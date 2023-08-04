package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.MainActivity;

import dagger.Component;

@Component
public interface CarComponent {
   Car getCar();
   void inject(MainActivity activity); // for the field injection
}
