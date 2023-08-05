package com.example.daggerhandson;

import android.app.Application;

import com.example.daggerhandson.Dagger.CarComponent;
import com.example.daggerhandson.Dagger.DaggerCarComponent;



// fields of the application object will retain as long as the application is open, this way you have a way to keep your component always live so you can create singletons without instanciating them.
public class DaggerApp extends Application {
    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerCarComponent.builder().horsePower(120).engineCapacity(1400).build();
    }

    public CarComponent getAppComponent() {
        return component;
    }
}
