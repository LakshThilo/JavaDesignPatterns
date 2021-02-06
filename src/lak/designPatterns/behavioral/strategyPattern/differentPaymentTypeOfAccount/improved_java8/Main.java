package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improved_java8;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(900);
        customer.payment(Account.bankPayment);
    }
}
