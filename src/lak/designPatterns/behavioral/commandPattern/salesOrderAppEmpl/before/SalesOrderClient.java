package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.before;

public class SalesOrderClient {

/* be to complete the remaining functionality using the command pattern, so, let's take a look at the app.

     This exercise is to implement command pattern, so that when the, involved method is called on the order
     handler's object in the main method, the correct functionality gets caught. You should have separate commands
     for placing orders and returning orders.
     The idea is that this sales order app could easily be used for ordering different types of items, not just for jackets.
     You shouldn't just do jackets.place orders anywhere in here,
     because we don't want this sales order client class, to be coupled to that functionality. */

// The issue of this is if i want to add more items I have to create more Object of it, and have pass i'm passing the object of here abd there like (jacket.placeOrder())
    public static void main(String[] args) {

        Jacket jacket= new Jacket();
        //Trousers trouser = new Trousers();

        OrderHandler placeOrderHandler = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();

        placeOrderHandler.invoke(jacket.placeOrder());
        returnOrderHandler.invoke(jacket.returnOrder());

       //placeOrderHandler.invoke(trouser.placeOrder());
        //returnOrderHandler.invoke(trouser.returnOrder());
    }
}
