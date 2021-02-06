package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this class handle xsl sheet documents
public class SpreadsheetHandler extends DocumentHandler {

    public SpreadsheetHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExtension) {
        if(fileExtension.equals("xlsx")){
            System.out.println("Opening spreadsheet document...");
        }  else {
            super.openDocument(fileExtension);
        }
    }
}

