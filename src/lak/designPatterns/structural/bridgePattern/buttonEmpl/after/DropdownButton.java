package lak.designPatterns.structural.bridgePattern.buttonEmpl.after;

public class DropdownButton extends Button {

    ButtonSize buttonSize;

    public DropdownButton(ButtonSize buttonSize){
        this.buttonSize = buttonSize;
    }

    @Override
    void draw() {
        buttonSize.setSize();
        System.out.println("Drawing a Dropdown Button...\n");
    }
}

