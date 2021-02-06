package lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.before;

import lak.designPatterns.behavioral.commandPattern.viewingDocumentEmpl.after.Command;

// So this button class is providing me with a layer of obstruction between the GUI and the functionality in the implementation of the command interface
//  the button class, which is the invoker. And this provides a layer of abstraction between the GUI class and the functionality in the document class
public class Button {

    // field of type string called text, which represents the text you'd see written on the button
    String text;

    // And in the constructor, you have to pass in that text.
    public Button(String text) {
        this.text = text;
    }

    public void click() {


    }
}
