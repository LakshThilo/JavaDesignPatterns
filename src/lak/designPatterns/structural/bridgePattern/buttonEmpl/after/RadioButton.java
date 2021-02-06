package lak.designPatterns.structural.bridgePattern.buttonEmpl.after;

public class RadioButton extends Button {

    ButtonSize buttonSize;

    public RadioButton(ButtonSize buttonSize){
        this.buttonSize = buttonSize;
    }

    @Override
    void draw() {

        buttonSize.setSize();
        System.out.println("Drawing a Radio Button...\n");
    }
}
