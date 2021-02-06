package lak.designPatterns.structural.compositePattern.payingExpensesExpl.after;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee{

    private List<Payee> payees = new ArrayList<>();


    void addPayee(Payee payee){
        payees.add(payee);
    }

    public void payExpenses(int amount){
        payees.forEach(payee -> payee.payExpenses(amount));

    }
}








