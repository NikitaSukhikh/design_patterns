package abstract_factory.furniture.factory;

import abstract_factory.furniture.furniture.Chair;
import abstract_factory.furniture.furniture.CoffeeTable;
import abstract_factory.furniture.furniture.Sofa;

public interface Factory {

    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();

}
