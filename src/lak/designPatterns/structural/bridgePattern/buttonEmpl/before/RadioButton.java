package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public abstract class RadioButton extends Button{

    @Override
    void draw() {
        System.out.println("Drawing a Radio Button...\n");
    }
}
