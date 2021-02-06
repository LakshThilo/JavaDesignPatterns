package lak.designPatterns.behavioral.templateMethodPattern.differentTypeOfPizza.improved;

public class MeatFeastPizza extends Pizza{

    public void addTopping(){
        super.addTopping();
        System.out.println("Add peppers");
        System.out.println("Add ham");
        System.out.println("Add chicken");
    }

    public  void cook(){
        System.out.println("Cook in the oven for 20 minutes");
    }

}
