package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public  class SmallCheckboxButton extends CheckboxButton {

    @Override
    void draw() {
        System.out.println("Setting size to Small..");
        super.draw();
    }
}
