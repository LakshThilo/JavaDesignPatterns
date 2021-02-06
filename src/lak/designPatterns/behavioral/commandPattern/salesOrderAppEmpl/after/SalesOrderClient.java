package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.after;

public class SalesOrderClient {

    private static Jacket jacket= new Jacket();
    private static Trousers trouser = new Trousers();

    public static void main(String[] args) {


        OrderHandler placeOrderHandler = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();

        placeOrderHandler.invoke(new PlaceOrderCommand(jacket));
        returnOrderHandler.invoke(new ReturnOrderCommand(jacket));

        placeOrderHandler.invoke(new PlaceOrderCommand(trouser));
        returnOrderHandler.invoke(new ReturnOrderCommand(trouser));

    }
}
