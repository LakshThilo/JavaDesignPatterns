package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this class handle power point documents
public class SlideShowHandler extends DocumentHandler {

    public SlideShowHandler(DocumentHandler next) {
        super(next);
    }

    //implement the open document method in this class

    @Override
    public void openDocument(String fileExtension) {
        if(fileExtension.equals("ppt")){
            System.out.println("Opening slideshow document...");
        }
        else {
            super.openDocument(fileExtension);
        }
    }

}
