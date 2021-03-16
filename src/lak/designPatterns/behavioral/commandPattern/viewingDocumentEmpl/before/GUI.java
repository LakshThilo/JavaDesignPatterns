package lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.before;


import lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.after.PrintCommand;
import lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.after.SaveCommand;

/**
    In this example, I've got a simple representation of a graphical user interface for viewing documents,
    I want to be able to add buttons in the GUI, and when they're clicked, I want certain actions to be performed on the documents.

        So for example, I want to create a Save button and when I click that save button, I want the document to be saved.
        Obviously in a real GUI, this would be a bit more sophisticated, but to keep this example simple,
        I'm just creating a button and a main method and calling the click method. However,

        I don't want the GUI or the button classes to hold the information about what happens when the buttons are clicked.
        I want to be able to define the look and feel in the GUI, but I don't want to define the functionality of the button clicks,
        because I want to be able to use this framework in other applications, not just for viewing documents but for other things too.
        So in other words, I want to decouple the back end functionality from the front end. And to do this, I'm going to use the command pattern */

/*
*  So now I've got a fully complete command pattern where the GUI class doesn't know about how the commands work under the hood.
    -- That's all in the document class,
  the button class, or the invoker provides a layer of obstruction  between this GUI and the command functionality by using the command objects. */

// class called GUI, which represents the user interface toolkits.
public class GUI {

    public static void main(String[] args) {

        Document document = new Document();

        Button saveButton = new Button();
        Button printButton = new Button();

        saveButton.click(document.save());
        printButton.click(document.print());

    }
}
