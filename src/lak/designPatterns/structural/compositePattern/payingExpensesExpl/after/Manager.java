package lak.designPatterns.structural.compositePattern.payingExpensesExpl.after;

public class Manager implements Payee{

    private String name;

    public Manager(String name){

        this.name = name;
    }

    @Override
    public void payExpenses(int amount){
        System.out.println(name +" has been paid $"+amount);
    }
}
