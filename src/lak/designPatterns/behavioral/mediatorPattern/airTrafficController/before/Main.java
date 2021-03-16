package lak.designPatterns.behavioral.mediatorPattern.airTrafficController.before;

public class Main {

    /* In this one, you're going to be refactoring an air-traffic control app using the mediator pattern to remove
    tight coupling. So let's have a look at the code. In the main class, there is a main method which creates an object
    of type plane, and then cause a method called takeoff. */

    /* In this exercise, you should refactor this app to decouple these classes using the mediator pattern. You should
    create a mediator class, which will act as the air traffic controller and handle all of the actions needed for takeoff
    to happen. You'll then be able to remove the planes on ground, planes in air and runway fields from the plane class.
    And in the main class, instead of creating a plane object, you should have a mediator object which will also have a
    takeoff method. */
    public static void main(String[] args) {

            Plane plane = new Plane(123);
            plane.takeOff();

        }

}
