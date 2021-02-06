package lak.designPatterns.structural.compositePattern.payingExpensesExpl.after;

public class Clerk implements Payee{

    private String name;
    private Manager manager;

    public Clerk(String name, Manager manager){

        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println(name+" has been paid $"+ amount);
    }
}
