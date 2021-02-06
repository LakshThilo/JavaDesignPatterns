package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;


/*Next there is a class called Factory Creator. This class has one method: Create Factory. Create Factory takes an
argument of type string, and this is the type of bike that needs to be created. If the argument passed in is Mountain Bike,
a Mountain Bike Factory will be returned. If a Road Bike Factory is created, a road bike will be returned, */
public class FactoryCreator {

    public static BikeFactory createFactory(String type){
        if(type.equalsIgnoreCase("mountain bike")){
            return new MountainBikeFactory();
        } else if(type.equalsIgnoreCase("road bike")){
            return new RoadBikeFactory();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}
