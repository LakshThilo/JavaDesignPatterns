package lak.designPatterns.structural.bridgePattern.buttonEmpl.after;

public class SmallButtonSize implements ButtonSize{

    @Override
    public void setSize() {
        System.out.println("Setting button size to small...");
    }
}
