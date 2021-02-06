package lak.designPatterns.structural.compositePattern.payingExpensesExpl.before;

public class ExpensesClient {

    /* This is a real world example of an app that would benefit from using the composite pattern. It's an app
    that's used for paying expenses to employees. So first of all, the app has a class called Manager, which
    has a field called name, and a method called payExpenses. In a real app, there would be some code in the
    payExpenses methods to actually make a payments*/

    public static void main(String[] args) {
        
        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob",jane);
        SalesPerson sue = new SalesPerson("Sue",jane);
        
        SalesTeam team = new SalesTeam();
        team.addManager(jane);
        team.addSalesPerson(bob);
        team.addSalesPerson(sue);
        
        payManager(jane, 100);
        paySalesperson(bob, 300);
        payTeam(team, 200);
    }

    /*In my ExpensesClient class, I have these three methods for paying expenses, but they're all really similar.
    The only difference between all of them is the type of objects I'm passing in. But the functionality of paying
    the expenses is exactly the same. It would be better if I could treat a Manager, a Salesperson, and a SalesTeam,
    as uniform things in my ExpensesClients. As far as the ExpensesClient is concerned, it doesn't matter if the
    employees are different types or how many there are. The function of this class is just to ensure the expenses
    payments are made, and it would be good to ignore the different types of employee. So this is a good example
    of where I can use the composite pattern.*/

    private static void paySalesperson(SalesPerson salesPerson, int amount) {
        System.out.println("Expenses have been requested");
        salesPerson.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }

    private static void payManager(Manager manager, int amount) {
        System.out.println("Expenses have been requested");
        manager.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }

    private static void payTeam(SalesTeam team, int amount) {
        System.out.println("Expenses have been requested");
        team.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }
}
