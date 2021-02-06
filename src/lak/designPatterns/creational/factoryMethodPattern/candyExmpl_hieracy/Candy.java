package lak.designPatterns.creational.factoryMethodPattern.candyExmpl_hieracy;

import java.util.ArrayList;

public abstract class Candy {

    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
