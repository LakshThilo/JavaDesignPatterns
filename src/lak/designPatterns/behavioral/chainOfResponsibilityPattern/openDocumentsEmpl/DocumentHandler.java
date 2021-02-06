package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;


/**
 *  In this example, I'm going to implement a successor chain and an app that opens documents.
    So a successor chain takes an argument, and it checks if it can be handled by the first handler in the chain.
    And if it can't, it passes it on to the next handler. And that handler checks if it can handle it.
    And if it can't, it passes it on again, and so on until it finds a handler that can handle the request.*/

// later we need to concrete implementation of this class for each different type of documents that i might want to handle
public abstract class DocumentHandler {

    // it's going to represent the next DocumentHandler in the chain
    private DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    // method for open documents
    public void openDocument(String fileExtension){

        // check that the next document handler is not null which means it's not the end of the chain
        if(next != null){
            next.openDocument(fileExtension);
        }else {
            System.out.println("Need to enter valid file extension");
        }
    }

    public void openImage(String fileExtension){

        // check that the next document handler is not null which means it's not the end of the chain
        if(next != null){
            next.openImage(fileExtension);
        }else {
            System.out.println("Need to enter valid file extension");
        }
    }
}
