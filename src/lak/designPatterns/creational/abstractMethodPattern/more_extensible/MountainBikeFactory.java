package lak.designPatterns.creational.abstractMethodPattern.more_extensible;

public class MountainBikeFactory extends BikeFactory {

   @Override
    public BikeParts create(String type){
       if(type.equalsIgnoreCase("tire")){
           return new MountainBikeTire();

       } else if(type.equalsIgnoreCase("handlebar")){
           return new MountainBikeHandlebar();

       } else {
           return null;
       }
   }
}
