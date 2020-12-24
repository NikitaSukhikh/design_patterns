package abstract_factory.furniture.factory;

import abstract_factory.furniture.furniture.*;


public class FactoryVictorian implements Factory {
    @Override
    public Chair createChair() {
        System.out.println("Victorian Chair created");
        return new ChairVictorian();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Victorian Sofa created");
        return new SofaVictorian();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        System.out.println("Victorian Coffee Table created");
        return new CoffeeTableVictorian();
    }
}
