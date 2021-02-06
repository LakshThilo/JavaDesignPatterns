package lak.designPatterns.behavioral.chainOfResponsibilityPattern.openDocumentsEmpl;

// this is where we going to implement the chain
public class Client {

    public static void main(String[] args) {

        DocumentHandler handler = new SlideShowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
        //handler.openDocument("ppt");
        handler.openDocument("text");
        handler.openDocument("xlsx");
        handler.openDocument("null");
        //handler.openDocument(null);

        DocumentHandler imageHandler =  new JpgImageHandler(new GifImageHandler(new PngImageHandler(null)));
        imageHandler.openImage(".png");
        imageHandler.openImage(".jpg");
        imageHandler.openImage(".gif");
    }

}
