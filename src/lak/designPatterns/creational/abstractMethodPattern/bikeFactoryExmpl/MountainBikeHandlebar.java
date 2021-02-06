package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;

/*There are also two classes called Mountain Bike Handlebar and Road Bike Handlebar. These are concrete classes that
extend the handlebar class. Mountain bike handlebars are straight, while road bike handlebars are drop handlebars.*/

public class MountainBikeHandlebar extends Handlebar{

    private static String type = "Flat";

    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar. Type: "+type);
    }
}
