package com.example.daggerhandson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.Dagger.CarComponent;
import com.example.daggerhandson.Dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
//        this.car = carComponent.getCar();
        carComponent.inject(this);
        car.drive();
    }
}