package lak.designPatterns.structural.compositePattern.payingExpensesExpl.after;

public class ExpensesClient {

    public static void main(String[] args) {
        
        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob",jane);
        SalesPerson sue = new SalesPerson("Sue",jane);

        Clerk john = new Clerk("John", jane);
        
        SalesTeam team = new SalesTeam();
        team.addPayee(jane);
        team.addPayee(bob);
        team.addPayee(sue);
        team.addPayee(john);

        payPayee(jane, 100);
        payPayee(bob, 900);
        payPayee(john, 300);

        payPayee(team, 200);



    }
    /*  Now my ExpensesClient class is much tidier. This class can handle all three types of payees the same, and if I added
        more types of payee in the future, I don't need to change anything in the ExpensesClient class at all. I can just make
        sure that the new payee implements the Payee interface, and I'll be able to use the payPayee method without making any
        changes in this class. So this is how you can use the composite pattern to handle objects and groups of objects in
        the same way.*/


    private static void payPayee(Payee payee, int amount) {
        System.out.println("Expenses have been requested");
        payee.payExpenses(amount);
        System.out.println("Expenses have been paid\n");
    }
}
