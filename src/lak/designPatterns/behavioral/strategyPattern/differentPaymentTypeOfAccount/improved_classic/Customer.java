package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improved_classic;

public class Customer {

    private int amount;

    public Customer(int amount){
        this.amount = amount;

    }

    public void payment(Account account){
        System.out.println("Payment of £"+amount+ account.makePayment());
    }
}
