package lak.designPatterns.creational.factoryMethodPattern.FullyImplemented;

import java.util.ArrayList;

public class HardCandyPeppermint extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i =1; i < quantity; i++) {
            HardCandyPeppermint peppermints = new HardCandyPeppermint();
            chocolatePackage.add(peppermints);
        }

        System.out.println("One package of " + quantity+ " hard candy peppermint chocolate has been made!");
        return chocolatePackage;
    }
}
