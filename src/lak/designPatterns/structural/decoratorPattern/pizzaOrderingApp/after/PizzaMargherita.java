package lak.designPatterns.structural.decoratorPattern.pizzaOrderingApp.after;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza{

    static ArrayList toppings = new ArrayList<String>();
    static String name = "Margherita";

    public PizzaMargherita(){
        toppings.add("cheese");
        toppings.add("tomato");

    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return name;
    }
}
