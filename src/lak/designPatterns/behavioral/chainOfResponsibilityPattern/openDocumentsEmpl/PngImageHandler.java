package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this class handle xsl sheet documents
public class PngImageHandler extends DocumentHandler {

    public PngImageHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openImage(String fileExtension) {
        if(fileExtension == ".png"){
            System.out.println("Start processing with .png");
        } else {
            super.openImage(fileExtension);
        }
    }
}

