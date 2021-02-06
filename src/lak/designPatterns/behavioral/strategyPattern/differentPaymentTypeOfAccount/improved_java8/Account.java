package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improved_java8;

public interface Account {

    String makePayment();

    Account payPalPayment = ()-> " Payment made from PayPal";

    Account bankPayment = ()-> " Payment made from Bank Account";
}
