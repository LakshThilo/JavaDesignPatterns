package lak.designPatterns.creational.factoryMethodPattern.candyExmpl_hieracy;

import java.util.ArrayList;

public class ChocolateDark extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i =1; i < quantity; i++) {
            ChocolateDark chocolateDark = new ChocolateDark();
            chocolatePackage.add(chocolateDark);
        }

        System.out.println("One package of " + quantity+ " dark chocolate has been made!");
        return chocolatePackage;
    }
}
