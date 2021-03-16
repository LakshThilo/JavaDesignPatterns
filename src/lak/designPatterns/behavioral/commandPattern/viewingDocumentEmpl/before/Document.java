package lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.before;

//  this is where I want to have my functionality, so the first thing I need to do is implement the functionality for saving and printing documents.
// the document class, which is the receiver. So this contains the actual functionality
public class Document {

    public String save(){

        return "Saving the document...";
    }

    public String print(){

        return "Printing the document...";
    }

}
