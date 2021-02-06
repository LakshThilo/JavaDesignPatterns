package lak.designPatterns.creational.factoryMethodPattern.FullyImplemented;

import java.util.ArrayList;

public class ChocolateMilk extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i =1; i < quantity; i++) {
            ChocolateMilk chocolateMilk = new ChocolateMilk();
            chocolatePackage.add(chocolateMilk);
        }

        System.out.println("One package of " + quantity+ " milk chocolate has been made!");
        return chocolatePackage;
    }
}
