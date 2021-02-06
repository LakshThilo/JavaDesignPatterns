package lak.designPatterns.structural.bridgePattern.buttonEmpl.after;

public class CheckboxButton extends Button {

    ButtonSize buttonSize;

    public CheckboxButton(ButtonSize buttonSize) {
            this.buttonSize = buttonSize;
    }

    @Override
    void draw() {
        buttonSize.setSize();
        System.out.println("Drawing a Checkbox Button..\n");
    }
}
