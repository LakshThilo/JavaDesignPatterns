package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class SmallRadioButton extends RadioButton {

    @Override
    void draw() {
        System.out.println("Setting size to Small..");
        super.draw();
    }
}
