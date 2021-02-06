package lak.designPatterns.behavioral.statePattern.tempController.after;

public class MediumState implements FanState {

    @Override
    public void turnUp(Fan fan) {

        fan.setState(new HighState());
        System.out.println("Refactored:Fan is on high");

    }

    @Override
    public void turnDown(Fan fan) {

        fan.setState(new LowState());
        System.out.println("Refactored:Fan is on low");
    }
}
