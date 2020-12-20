package builder.cars.test;

import builder.cars.builders.CarBuilder;
import builder.cars.builders.CarManualBuilder;
import builder.cars.cars.Car;
import builder.cars.cars.Manual;
import builder.cars.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director d = new Director();

        CarBuilder builder = new CarBuilder();
        d.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built: " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        d.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
