package lak.designPatterns.behavioral.mementoPattern.writingTextToDocument.after;

/*In this example I have an app for writing text to a document. I want to add Save and Undo operations to it. And I'm going to do that using the memento pattern.*/
public class DocumentViewer {

    private static TextDocument textDocument = new TextDocument();

    public static void main(String[] args) {

        /** I want to be able to save after hello, then add world and then go back to just hello. */
        textDocument.write("hello");
        textDocument.save();
        textDocument.print();

        textDocument.write(" world");
        textDocument.print();
        textDocument.undo();
        textDocument.print();


        textDocument.write(" End");
        textDocument.print();
        textDocument.undo();
        textDocument.print();

    }
}
