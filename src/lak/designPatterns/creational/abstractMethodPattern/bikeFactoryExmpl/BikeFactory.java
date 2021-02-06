package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;

/* it has two methods called createTire and createHandlebar. Obviously, in reality, more than just tires and
a handlebar are needed to make a bike. There will also need to be brakes, gears, a saddle, pedals, and so on.
There might also be other types of bike that need to be created besides mountain bikes and road bikes.

 Next there is an abstract class called Bike Factory. This declares two methods: Create Tire and Create Handlebar. */

public abstract class BikeFactory {

    abstract Tire createTire();

    abstract Handlebar createHandlebar();
}
