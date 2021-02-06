package lak.designPatterns.behavioral.statePattern.tempController.after;

public class LowState implements FanState {

    @Override
    public void turnUp(Fan fan) {

        fan.setState(new MediumState());
        System.out.println("Refactored:Fan is on medium");
    }

    @Override
    public void turnDown(Fan fan) {

    }
}
