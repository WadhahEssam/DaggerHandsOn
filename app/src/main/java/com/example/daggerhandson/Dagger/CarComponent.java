package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.MainActivity;

import dagger.Component;

@Component (modules = {CarModule.class, PetrolEngineModule.class})
public interface CarComponent {
   Car getCar();
   void inject(MainActivity activity); // for the field injection, Note: You can not just add Activity instead of MainActivity
}
