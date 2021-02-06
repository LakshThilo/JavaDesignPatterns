package lak.designPatterns.structural.facadePattern.manualGearBoxEmpl.before;

public class Car {

    public static void main(String[] args) {
        Ignition ignition = new Ignition();
        Clutch clutch = new Clutch();
        Accelerator accelerator = new Accelerator();
        GearStick gearStick = new GearStick();
        Handbrake handbrake = new Handbrake();

        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelerator.press();
        clutch.lift();
        handbrake.pushDown();
        accelerator.press();
        clutch.press();

        /*. If I run the app. I can see it print out in the console, the different steps, such as, turning the ignition on,
        pressing the clutch down, changing to gear one, and so on. This exercise is to create a facade class, so that the
        functionality, for driving the car, is moved out of the car class.*/

    }
}
