package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class MediumRadioButton extends RadioButton{

    @Override
    void draw() {
        System.out.println("Setting size to Medium..");
        super.draw();
    }
}
