package com.example.daggerhandson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerhandson.Car.Car;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        car.drive();
    }
}