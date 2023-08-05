package com.example.daggerhandson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.Dagger.CarComponent;
import com.example.daggerhandson.Dagger.DaggerCarComponent;
import com.example.daggerhandson.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = ((DaggerApp) getApplication()).getAppComponent();
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}