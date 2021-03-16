package lak.designPatterns.behavioral.mediatorPattern.airTrafficController.after;

public class Runway {

    private boolean isAvailable = true;

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
}
