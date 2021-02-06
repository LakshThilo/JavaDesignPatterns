package lak.designPatterns.creational.builderPattern.ex1_createRooms.refactoredWithInterface;

import java.awt.*;


/*
    Finally, the return types of the interface are by default set to BedroomBuilder, but the return types should be Builder,
    and the specific type of Builder can be specified when the method's implemented in the concrete builders. Now, it is possible
    to have different implementations of the builder for different rooms. All of the builders will need methods to set the dimensions,
    floor number, number of windows, and so on, but they can also have other methods that are not in a BedroomBuilder class.
    For example, a kitchenBuilder might also have methods to specify if it has a dishwasher or has a microwave. There would
    also need to be a new class called Kitchen which the KitchenBuilder would build. A further change we could make is to have
    an abstract class called Room which all of our different rooms would implement. However, in the classic builder pattern,
    this is not necessary. Usually, the products produced by the concrete builders are so different that it is not worth doing this.
    The application is now a more complete example of the classic builder pattern, and can easily be extended to accommodate other room types.*/

public interface Builder {

    Builder setDimension(Dimension dimension);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(Color wallColor);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
