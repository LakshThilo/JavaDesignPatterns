package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public abstract class CheckboxButton extends Button{

    @Override
    void draw() {
        System.out.println("Drawing a Checkbox Button..\n");
    }
}
