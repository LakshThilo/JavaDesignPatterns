package lak.designPatterns.behavioral.statePattern.tempController.after;

public class HighState implements FanState {

    @Override
    public void turnUp(Fan fan) {

    }

    @Override
    public void turnDown(Fan fan) {

        fan.setState(new MediumState());
        System.out.println("Refactored:Fan is on medium");
    }
}
