package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public  class LargeCheckboxButton extends CheckboxButton{

    @Override
    void draw() {
        System.out.println("Setting size to Large..");
        super.draw();
    }
}
