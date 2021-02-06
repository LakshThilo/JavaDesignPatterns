package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public  class MediumCheckboxButton extends CheckboxButton{

    @Override
    void draw() {
        System.out.println("Setting size to Medium..");
        super.draw();
    }
}
