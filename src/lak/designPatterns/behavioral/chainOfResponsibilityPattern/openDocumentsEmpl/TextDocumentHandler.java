package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this class handle power point documents
public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExtension) {
        if(fileExtension.equals("text")){
            System.out.println("Opening Text document...");
        }  else {
            super.openDocument(fileExtension);
        }

    }
}
