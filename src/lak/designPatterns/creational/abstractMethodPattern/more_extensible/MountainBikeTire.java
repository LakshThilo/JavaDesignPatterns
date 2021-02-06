package lak.designPatterns.creational.abstractMethodPattern.more_extensible;

/* Then there are two more classes called Mountain Bike Tire and Road Bike Tire. These are the concrete implementations
of the abstract tire class. Both Mountain Bike Tire and Road Bike Tire provide implementations of the getDescription method.
These are slightly different because the Mountain Bike Tire class prints out both the width and the pressure; Road Bike
Tire only prints out the width. */

public class MountainBikeTire extends Tire {

    private static final String width = "WIDE";
    private static final String pressure = "MEDIUM";

    @Override
    void getDescription() {
        System.out.println("Mountain bike tire. Width: "+width+ ", pressure: "+ pressure);

    }
}
