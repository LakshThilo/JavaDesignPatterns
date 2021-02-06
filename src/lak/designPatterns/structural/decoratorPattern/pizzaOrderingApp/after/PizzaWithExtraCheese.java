package lak.designPatterns.structural.decoratorPattern.pizzaOrderingApp.after;

import java.util.ArrayList;

public class PizzaWithExtraCheese implements Pizza{

    ArrayList toppings;
    Pizza pizza;

    PizzaWithExtraCheese(Pizza pizza){
        this.pizza = pizza;
        toppings = pizza.getToppings();
        toppings.add("extra cheese");
    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
