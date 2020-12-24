package abstract_factory.furniture.factory;

import abstract_factory.furniture.furniture.*;


public class FactoryModern implements Factory {
    @Override
    public Chair createChair() {
        System.out.println("Modern Chair created");
        return new ChairModern();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Modern Sofa created");
        return new SofaModern();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        System.out.println("Modern CoffeeTable created");
        return new CoffeeTableModern();
    }
}
