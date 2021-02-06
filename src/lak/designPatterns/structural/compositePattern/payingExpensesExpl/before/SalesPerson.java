package lak.designPatterns.structural.compositePattern.payingExpensesExpl.before;

public class SalesPerson {

    private String name;

    private Manager manager;

    public SalesPerson(String name, Manager manager){
        this.name = name;
        this.manager = manager;

    }

    public void payExpenses(int amount){
        System.out.println(name+" has been paid $"+ amount);
    }

}
