package lak.designPatterns.structural.decoratorPattern.pizzaOrderingApp.before;

/*  you need to add a decorator class for adding a topping of extra cheese. Customers should be able to order any
    of these three pizzas, but have topping of extra cheese to.*/

public class Main {

    public static void main(String[] args) {
        order(new PizzaMargherita());
        order(new PizzaHawaiian());
        order(new PizzaPepperoni());
    }

    public static void order(Pizza pizza){

        System.out.println("You have ordered a "+pizza.getName() +
                " pizza. The topping are " + pizza.getToppings() + ".");
    }
}
