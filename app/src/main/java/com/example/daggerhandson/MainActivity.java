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
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent carComponent = DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(100)).build();
        CarComponent carComponent = DaggerCarComponent.builder().horsePower(120).engineCapacity(2000).build(); // this is how to pass the instance in a very elegant way

        carComponent.inject(this);
        car.drive();
    }
}