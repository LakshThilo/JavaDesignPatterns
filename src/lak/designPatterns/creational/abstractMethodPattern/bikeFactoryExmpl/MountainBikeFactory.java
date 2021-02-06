package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;

public class MountainBikeFactory extends BikeFactory{



    @Override
    Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
}
