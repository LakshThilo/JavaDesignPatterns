package lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.after;

public class  PrintCommand implements Command {

    private Document document;

    public PrintCommand(Document document){
        this.document = document;
    }

    @Override
    public void execute() {

        document.print();

    }
}
