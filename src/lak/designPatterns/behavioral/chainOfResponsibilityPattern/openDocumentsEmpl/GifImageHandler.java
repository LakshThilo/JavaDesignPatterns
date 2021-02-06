package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this class handle xsl sheet documents
public class GifImageHandler extends DocumentHandler {

    public GifImageHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openImage(String fileExtension) {
        if(fileExtension == ".gif"){
            System.out.println("Start processing with .gif");
        } else {
            super.openImage(fileExtension);
        }
    }
}

