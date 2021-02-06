package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class SmallDropdownButton extends DropdownButton{

    @Override
    void draw() {
        System.out.println("Setting size to Small..");
        super.draw();
    }
}
