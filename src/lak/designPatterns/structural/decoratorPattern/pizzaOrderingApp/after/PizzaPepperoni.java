package lak.designPatterns.structural.decoratorPattern.pizzaOrderingApp.after;

import java.util.ArrayList;

public class PizzaPepperoni implements Pizza{

    static ArrayList toppings = new ArrayList<String>();
    static String name = "Pepperoni";

    public PizzaPepperoni(){
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("peperoni");
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
