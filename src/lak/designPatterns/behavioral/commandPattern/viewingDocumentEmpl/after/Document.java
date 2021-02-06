package lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.after;

//  this is where I want to have my functionality, so the first thing I need to do is implement the functionality for saving and printing documents.
// the document class, which is the receiver. So this contains the actual functionality
public class Document {

    public void save(){

        System.out.println("Saving the document...");
    }

    public void print(){

        System.out.println("Printing the document...");
    }

}
