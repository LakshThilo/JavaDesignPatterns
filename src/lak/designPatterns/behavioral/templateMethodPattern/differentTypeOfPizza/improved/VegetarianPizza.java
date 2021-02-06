package lak.designPatterns.behavioral.templateMethodPattern.differentTypeOfPizza.improved;

public class VegetarianPizza extends Pizza{


    public void addTopping(){

        super.addTopping();
        System.out.println("Add peppers");
        System.out.println("Add olives");
    }

    public  void cook(){
        System.out.println("Cook in the oven for 15 minutes");
    }

}
