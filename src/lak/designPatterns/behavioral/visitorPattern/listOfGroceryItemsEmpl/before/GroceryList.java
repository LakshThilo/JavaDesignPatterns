package lak.designPatterns.behavioral.visitorPattern.listOfGroceryItemsEmpl.before;

import java.util.ArrayList;

public class GroceryList implements Groceries{

    ArrayList<Groceries> groceries = new ArrayList<>();

    public GroceryList(){

        Bread bread = new Bread();
        Bread bread2 = new Bread();
        Milk milk = new Milk();
        groceries.add(bread);
        groceries.add(bread2);
        groceries.add(milk);
    }

    @Override
    public double getPrice() {
        return groceries.stream().mapToDouble(Groceries::getPrice).sum();
    }
}
