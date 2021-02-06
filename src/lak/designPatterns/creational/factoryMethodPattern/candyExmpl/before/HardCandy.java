package lak.designPatterns.creational.factoryMethodPattern.candyExmpl.before;

import java.util.ArrayList;

public class HardCandy extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardChocolatePackage = new ArrayList();
        for (int i = 1; i < quantity; i++) {
            HardCandy hardCandy = new HardCandy();
            hardChocolatePackage.add(hardCandy);
        }

        System.out.println("One package of " + quantity + " chocolate has been made!");
        return hardChocolatePackage;
    }
}
