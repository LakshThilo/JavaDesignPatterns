package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.before;

public class SalesOrderClient {


// The issue of this is if i want to add more items I have to create more Object of it, and have pass i'm passing the object of here abd there like (jacket.placeOrder())
    public static void main(String[] args) {

        Jacket jacket= new Jacket();
        Trousers trouser = new Trousers();

        OrderHandler placeOrderHandler = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();

        placeOrderHandler.invoke(jacket.placeOrder());
        returnOrderHandler.invoke(jacket.returnOrder());

        placeOrderHandler.invoke(trouser.placeOrder());
        returnOrderHandler.invoke(trouser.returnOrder());
    }
}
