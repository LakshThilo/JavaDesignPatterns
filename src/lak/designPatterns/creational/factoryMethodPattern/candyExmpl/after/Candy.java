package lak.designPatterns.creational.factoryMethodPattern.candyExmpl.after;

import java.util.ArrayList;

public abstract class Candy {

    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
