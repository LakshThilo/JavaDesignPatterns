package lak.designPatterns.creational.factoryMethodPattern.candyExmpl_hieracy;

import java.util.ArrayList;

public class HardCandyLollipop extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i =1; i < quantity; i++) {
            HardCandyLollipop lollipops = new HardCandyLollipop();
            chocolatePackage.add(lollipops);
        }

        System.out.println("One package of " + quantity+ " hard candy lollipop has been made!");
        return chocolatePackage;
    }
}
