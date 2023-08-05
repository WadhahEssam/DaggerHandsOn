package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import kotlin.BuilderInference;

@Component (modules = {CarModule.class, PetrolEngineModule.class})
public interface CarComponent {
   Car getCar();
   void inject(MainActivity activity); // for the field injection, Note: You can not just add Activity instead of MainActivity


   // this is just defining the .builder() interface our selves so we can pass values at run time inside the builder function
   @Component.Builder
   interface Builder {
      CarComponent build(); // this one will be populated by dagger itself, (it is the default one)

      @BindsInstance
         // allows us to chain
      Builder horsePower(@Named("horsePower") int horsePower);


      @BindsInstance
      Builder engineCapacity(@Named("engineCapacity") int engineCapacity);
   }
}
