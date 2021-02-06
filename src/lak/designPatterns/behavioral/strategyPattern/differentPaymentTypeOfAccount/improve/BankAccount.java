package lak.designPatterns.behavioral.strategyPattern.differentPaymentTypeOfAccount.improve;

public class BankAccount implements Account {

    @Override
    public String makePayment() {
        return " made from bank account";
    }
}
