package lak.designPatterns.behavioral.statePattern.tempController.before;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnUp();
        fan.turnUp();
        fan.turnDown();
        fan.turnDown();
        fan.turnUp();
    }
}
