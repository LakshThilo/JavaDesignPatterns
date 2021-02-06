package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improve;

public class PayPalAccount implements Account {

    @Override
    public String makePayment() {
        return " made from PayPal.";
    }
}
