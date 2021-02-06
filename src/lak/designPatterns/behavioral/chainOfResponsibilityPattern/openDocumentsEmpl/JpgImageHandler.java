package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this class handle xsl sheet documents
public class JpgImageHandler extends DocumentHandler {

    public JpgImageHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openImage(String fileExtension) {
        if(fileExtension == ".jpg"){
            System.out.println("Start processing with .jpg");
        } else {
            super.openImage(fileExtension);
        }
    }
}

