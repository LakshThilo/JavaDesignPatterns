package lak.designPatterns.creational.factoryMethodPattern.candyExmpl_hieracy;

import java.util.ArrayList;

public class ChocolateWhite extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i =1; i < quantity; i++) {
            ChocolateWhite chocolateWhite = new ChocolateWhite();
            chocolatePackage.add(chocolateWhite);
        }

        System.out.println("One package of " + quantity+ " white chocolate has been made!");
        return chocolatePackage;
    }
}
