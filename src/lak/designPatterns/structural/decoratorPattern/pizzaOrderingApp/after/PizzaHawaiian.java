package lak.designPatterns.structural.decoratorPattern.pizzaOrderingApp.after;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza{

    static ArrayList toppings = new ArrayList<String>();
    static String name = "Hawaiian";

    public PizzaHawaiian(){
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("ham");
        toppings.add("pineapple");
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
