package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improve;

public class Customer {

    private int amount;

    public Customer(int amount){
        this.amount = amount;

    }

    public void payment(Account account){
        System.out.println("Payment of £"+amount+ account.makePayment());
    }
}
