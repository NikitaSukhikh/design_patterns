package abstract_factory.furniture.application;

import abstract_factory.furniture.factory.Factory;
import abstract_factory.furniture.factory.FactoryArtDeco;
import abstract_factory.furniture.factory.FactoryModern;
import abstract_factory.furniture.factory.FactoryVictorian;


public class Demo {

    public static void main(String[] args) {



        Factory modern = new FactoryModern();
        Factory artDeco = new FactoryArtDeco();
        Factory victorian = new FactoryVictorian();

        new Application(modern); System.out.println("");
        new Application(artDeco); System.out.println("");
        new Application(victorian); System.out.println("");




        /* the same result:
        new Application(new FactoryArtDeco());
        System.out.println("");
        new Application(new FactoryModern());
        System.out.println("");
        new Application(new FactoryVictorian()); */

    }
}
