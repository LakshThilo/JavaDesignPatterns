package lak.designPatterns.behavioral.templateMethodPattern.differentTypeOfPizza.before;

public class VegetarianPizza {

    public void makeBase(){

        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }

    public void addTopping(){

        System.out.println("Add tomato");
        System.out.println("Add cheese");
        System.out.println("Add peppers");
        System.out.println("Add olives");
    }

    public  void cook(){
        System.out.println("Cook in the oven for 15 minutes");
    }

    public void printInstructions(){
        makeBase();
        addTopping();
        cook();
        System.out.println();

    }
}
