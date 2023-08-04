package com.example.daggerhandson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.Dagger.CarComponent;
import com.example.daggerhandson.Dagger.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        this.car = carComponent.getCar();
        car.drive();
    }
}