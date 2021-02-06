package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;

/* A more complete version of the application might have a class called Saddle, so I would need to add a create saddle
method to the BikeFactory class, but I would also need to implement this abstract method in the other factory classes
that extend BikeFactory, including mountain bike factory and road bike factory, and any other types of BikeFactory that
I might want to add in the future. So I would need to go through and add the create saddle method to all of the classes
that extend BikeFactory. That is a lot of places where new code needs to be added, especially if more bike types are added.
And I would need to do this for every single new part that needs to be created. The solution to this problem is to remove
all of the methods to create individual parts and have a single create method. This method would take a parameter that
identifies which kind of bike part is being made and return that part. This will make the code much more flexible.
Instead of having a separate method for creating every single part, only one is needed. However, although this approach
is more flexible, it also slightly more risky, especially in statically typed languages like Java. It would only work
if all bike parts extends the same abstract class.*/


public class BikeBuilder {

    public static void main(String[] args) {

        createBikeWithoutAbstractFactory();
        createBikeWithAbstractFactory("road bike");

    }

    /* final class is Bike Builder. This is the class that collects the bike parts to build a bike. It currently has two
    methods: create Bike without Abstract Factory and create Bike with Abstract Factory, plus a main method. Creates Bike
    without Abstract Factory shows what the code would look like if the Abstract Factory pattern was not used, while creates
    Bike with Abstract Factory shows what it looks like when the factories are used. Create Bike with Abstract Factory takes
    a string parameter, which is used to determine which type of bike to make. The main method caused both of these methods.
    For the creates Bike with Abstract Factory method it specifies a mountain bike as the type of bike to create. */

    public static void createBikeWithoutAbstractFactory() {

        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();

    }

    public static void createBikeWithAbstractFactory(String type) {

        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();
        System.out.println();

    }

    /* If I run the application the output shows that both the methods do exactly the same thing. They both create two mountain bike
    tires and a mountain bike handlebar, and prints out their descriptions. However, in a method that does not use the factories the
    code has to be specific about what type of tire it creates and use the concrete type. If I changed my mind and decided I wanted
    this method to return a road bike instead of a mountain bike I would have to completely rewrite this. Every time a mountain bike
    tire is made I would have to change it to road bike tire, and when a mountain bike handlebar is made I would have to change it to
    road bike handlebar. In contrast, if I want to use the create Bike with Abstract Factory to make a road bike it is very simple.
    All I would have to do is change the argument I pass in in the main method.

    * If I change mountain to road it will make the parts for a road bike. If I run the application again the output shows that with one
    simple change I have used the creates Bike with Abstract Factory method to make a road bike. Using this method there is no points where
    the concrete types of the bike parts are specified. The code is nicely decoupled and the details are abstracted from the Bike Builder class.
    This is a much better implementation than the creates Bike without Abstract Factory method. */
}
