package abstract_factory.furniture.factory;

import abstract_factory.furniture.furniture.*;


public class FactoryArtDeco implements Factory {
    @Override
    public Chair createChair() {
        System.out.println("ArtDeco Chair created");
        return new ChairArtDeco();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("ArtDeco Sofa created");
        return new SofaArtDeco();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        System.out.println("ArtDeco Coffee Table created");
        return new CoffeeTableArtDeco();
    }
}
