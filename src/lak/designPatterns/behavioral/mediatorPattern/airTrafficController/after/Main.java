package lak.designPatterns.behavioral.mediatorPattern.airTrafficController.after;

public class Main {

    /*. So if I run this up, I can see it says, "Plane 123 is taking off." So this is how the Mediator pattern can be
    used to create loose coupling between objects. If I wanted to add more planes, I could just add a new plane object
    in the Mediator class, and handle all the functionality for taking off for both planes in here.*/

    public static void main(String[] args) {

            Mediator mediator = new Mediator();
            mediator.takeOff();

        }

}
