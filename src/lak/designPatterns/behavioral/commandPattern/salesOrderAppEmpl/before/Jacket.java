package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.before;

/* requirement is to call theses method using Order handler class
    1. we can pass classes to another- bad  - tightly coupled
    2. using interface(Command Pattern) - good - loosely coupled
 */
public class Jacket {

    // both method was void originally
    public String placeOrder(){
        return "Jacket order has been placed";
    }

    public String returnOrder(){
        return "Jacket order has been returned";
    }
}
