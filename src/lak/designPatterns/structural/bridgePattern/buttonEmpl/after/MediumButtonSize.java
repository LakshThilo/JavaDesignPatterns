package lak.designPatterns.structural.bridgePattern.buttonEmpl.after;

public class MediumButtonSize implements ButtonSize{

    @Override
    public void setSize() {
        System.out.println("Setting button size to medium...");
    }
}
