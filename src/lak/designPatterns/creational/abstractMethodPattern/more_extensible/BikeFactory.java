package lak.designPatterns.creational.abstractMethodPattern.more_extensible;

/*Inside the BikeFactory class, there is now only a single method. This avoids the necessity to create a method for both
the different BikeParts. Any more BikeParts that need to be created would have to be added here, as well as in every factory
that extends BikeFactory. Now, however, Handlebar and Tire both extend the BikePart class, so it is possible to have a single
create method that can return any kind of BikePart. A method takes an argument of type String that identifies which part
should be returned. In the concrete classes that extend BikeFactory, there are if statements to determine which parts to
return based on the string.*/
public abstract class BikeFactory {

    abstract BikeParts create(String type);


}
