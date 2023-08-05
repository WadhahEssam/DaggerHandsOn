package com.example.daggerhandson.Dagger;

import com.example.daggerhandson.Car.Car;
import com.example.daggerhandson.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import kotlin.BuilderInference;

@Singleton // you have always to make the dragger component as singleton if any of the injection below has a singleton, but the singleton only works with one component, so if you are creating a
// another component, it will actually not care for the singleton annotation that you just created.
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
