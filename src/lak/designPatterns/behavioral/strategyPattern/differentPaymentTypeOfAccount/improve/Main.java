package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improve;

/*In this one, you're going to be refactoring an application to make payments from different types of accounts using the strategy pattern.*/
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(200);
        BankAccount bankAccount = new BankAccount();
        customer.payment(bankAccount);

    }
}
