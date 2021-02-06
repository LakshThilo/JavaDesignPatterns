package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class MediumDropdownButton extends DropdownButton{

    @Override
    void draw() {
        System.out.println("Setting size to Medium..");
        super.draw();
    }
}
