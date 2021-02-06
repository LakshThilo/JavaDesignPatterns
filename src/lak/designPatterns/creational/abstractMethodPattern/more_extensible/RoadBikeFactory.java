package lak.designPatterns.creational.abstractMethodPattern.more_extensible;

public class RoadBikeFactory extends BikeFactory {

    /* If a new bike part needs to be added at this point, there is no need to create a new method. All that needs to be
    done is to add it to the if statement in the appropriate factory class. For example, if there was a class called
    MountainBikeMouthguards, another if else could be added to the create method in the MountainBikeFactory class. It
    would say that if the type equals mouthguards, then return a new MountainBikeMouthguard. There would be no need to
    have a whole new method for it*/

    @Override
    public BikeParts create(String type){
        if(type.equalsIgnoreCase("tire")){
            return new RoadBikeTire();

        } else if(type.equalsIgnoreCase("handlebar")){
            return new RoadBikeHandlebar();

        } else {
            return null;
        }
    }
}
