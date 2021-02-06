package lak.designPatterns.structural.facadePattern.manualGearBoxEmpl.after;

public class Car {

    public static void main(String[] args) {

        CarFacade carFacade = new CarFacade();
        carFacade.drive();

    }
}
