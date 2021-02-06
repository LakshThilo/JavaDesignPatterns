package lak.designPatterns.structural.decoratorPattern.pizzaOrderingApp.after;

public class Main {

    public static void main(String[] args) {
        order(new PizzaMargherita());
        order(new PizzaHawaiian());
        order(new PizzaPepperoni());
        order(new PizzaWithExtraCheese(new PizzaPepperoni()));
    }

    public static void order(Pizza pizza){

        System.out.println("You have ordered a "+pizza.getName() +
                " pizza. The topping are " + pizza.getToppings() + ".");
    }
}
