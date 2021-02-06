package lak.designPatterns.structural.compositePattern.payingExpensesExpl.before;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam {

    private List<Manager> managers = new ArrayList<>();
    private List<SalesPerson> salesPeople = new ArrayList<>();

    void addManager(Manager manager){
        managers.add(manager);
    }

    void addSalesPerson(SalesPerson salesPerson){
        salesPeople.add(salesPerson);
    }

    public void payExpenses(int amount){
        managers.forEach(manager -> manager.payExpenses(amount));
        salesPeople.forEach(salesPerson -> salesPerson.payExpenses(amount));
    }
}








