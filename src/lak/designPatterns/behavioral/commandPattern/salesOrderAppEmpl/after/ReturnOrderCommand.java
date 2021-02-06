package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.after;

public class ReturnOrderCommand implements Command {

    private Jacket jacket;
    private Trousers trouser;

    public ReturnOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    public ReturnOrderCommand(Trousers trouser) {
        this.trouser = trouser;
    }


    @Override
    public void execute() {

        if(jacket!=null) {
            jacket.returnOrder();

        } else if(trouser!= null){
            trouser.returnOrder();
        }
    }
}
