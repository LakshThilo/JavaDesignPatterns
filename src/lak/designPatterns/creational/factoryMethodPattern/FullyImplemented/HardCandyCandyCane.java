package lak.designPatterns.creational.factoryMethodPattern.FullyImplemented;

import java.util.ArrayList;

public class HardCandyCandyCane extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i =1; i < quantity; i++) {
            HardCandyCandyCane candyCane = new HardCandyCandyCane();
            chocolatePackage.add(candyCane);
        }

        System.out.println("One package of " + quantity+ " hard candy  candy cake  has been made!");
        return chocolatePackage;
    }
}
