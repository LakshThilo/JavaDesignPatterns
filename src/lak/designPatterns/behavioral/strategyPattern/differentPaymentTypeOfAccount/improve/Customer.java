package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improve;

/*  This class has two methods, make bank account payments, and make PayPal payments. These represent different ways
    the customer could pay for something. It doesn't really make sense for all the different types of payments to be
    in this class. A customer might not even have a PayPal account, for example. So it doesn't make sense to maintain
    the functionality for making PayPal payments in this class. And if I want to add other types of payments,
    for example, cash payments, this class is just going to get bigger. */
public class Customer {

    private int amount;

    public Customer(int amount){
        this.amount = amount;

    }

    public void payment(Account account){
        System.out.println("Payment of £"+amount+ account.makePayment());
    }
}
