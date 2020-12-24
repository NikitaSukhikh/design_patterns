package abstract_factory.furniture.application;

import abstract_factory.furniture.factory.Factory;
import abstract_factory.furniture.furniture.Chair;

public class Application {
    Chair chair;

    public Application (Factory factory){

        factory.createCoffeeTable();
        factory.createChair();
        factory.createSofa();
    }

    public void runApp () {
        chair.hasLegs();

    }
}
