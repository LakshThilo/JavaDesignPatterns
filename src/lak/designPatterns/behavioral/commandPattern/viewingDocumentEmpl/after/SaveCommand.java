package lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.after;

/**  encapsulate those pieces of functionality of document class inside saveCommand class */
public class SaveCommand implements Command {

    private Document document;

    public SaveCommand(Document document){
        this.document = document;
    }

    @Override
    public void execute() {

        document.save();
    }
}
