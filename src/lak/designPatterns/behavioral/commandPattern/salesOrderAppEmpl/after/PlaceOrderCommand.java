package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.after;

public class PlaceOrderCommand implements Command {

    private Jacket jacket;
    private Trousers trouser;

    public PlaceOrderCommand(Jacket jacket) {

        this.jacket = jacket;
    }

    public PlaceOrderCommand(Trousers trouser) {

        this.trouser = trouser;
    }

    @Override
    public void execute( ) {


        if(jacket!= null){
            jacket.placeOrder();
        } else if(trouser!= null){
            trouser.placeOrder();
        }
    }

}
