package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improved_classic;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(500);

        Account payPalAccount = () -> " made payment with PayPal";
        customer.payment(payPalAccount);

        Account bankAccount = () -> " made payment with Bank Account";
        customer.payment(bankAccount);
    }
}
