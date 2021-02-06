package lak.designPatterns.behavioral.commandPattern.salesOrderAppEmpl.after;

public class OrderHandler {

    public void invoke(Command command) {

        command.execute();
    }
}
