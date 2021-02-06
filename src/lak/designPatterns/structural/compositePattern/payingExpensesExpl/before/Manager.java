package lak.designPatterns.structural.compositePattern.payingExpensesExpl.before;

public class Manager {

    private String name;

    public Manager(String name){

        this.name = name;
    }

    public void payExpenses(int amount){

        System.out.println(name +" has been paid $"+amount);
    }
}
