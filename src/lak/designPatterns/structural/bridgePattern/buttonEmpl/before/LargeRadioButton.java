package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class LargeRadioButton extends RadioButton{

    @Override
    void draw() {
        System.out.println("Setting size to Large..");
        super.draw();
    }
}
