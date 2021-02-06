package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class LargeDropdownButton extends DropdownButton{

    @Override
    void draw() {
        System.out.println("Setting size to Large..");
        super.draw();
    }
}
