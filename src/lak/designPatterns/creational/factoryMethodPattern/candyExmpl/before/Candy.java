package lak.designPatterns.creational.factoryMethodPattern.candyExmpl.before;

import java.util.ArrayList;

public abstract class Candy {

    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
