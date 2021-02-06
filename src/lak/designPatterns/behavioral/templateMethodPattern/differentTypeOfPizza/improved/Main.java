package lak.designPatterns.behavioral.templateMethodPattern.differentTypeOfPizza.improved;

/*In this example, I have an app that's used to create different types of pizza. There are some problems with how
this app is structured at the moment, so I'm going to refactor it to use the template method button. So this app
has a class called vegetarian pizza. In here, I have three methods called make base, adds toppings, and cook,
which are the three steps for making the pizza. In each of these methods, I'm just printing out to the console
what's happening in each step*/
public class Main {

    public static void main(String[] args) {

        VegetarianPizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.printInstructions();

        MeatFeastPizza meatFeastPizza = new MeatFeastPizza();
        meatFeastPizza.printInstructions();
    }
}
