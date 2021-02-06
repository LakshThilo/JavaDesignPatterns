package lak.designPatterns.creational.builderPattern.ex1_createRooms.refactoredWithInterface;


/*  In this section, I will refactor the example application to create a more complete builder pattern.
    Currently, it uses a simple builder to create bedroom objects. The Architect class creates bedroom objects
    by specifying the characteristics of the bedrooms that are needed, however, it would be useful if it was
    possible to create different kinds of rooms, such as kitchens, bathrooms and so on.

    In the classic builder pattern, the Builder class is actually an abstract interface. In this example, there
    could be an interface that defines methods for building rooms in general, and there could be different concrete builders
    for different types of rooms. This would be useful because building a bedroom has some of the same requirements for building a
    kitchen, but in some respects, is very different. To achieve this, the first thing we need to do is to create the abstract interface. */

import java.awt.*;

/** On the left of the screen, there is a menu called Projects. First, I need to right-click on the BedroomBuilder class in the Projects menu. I then go to Refactor, and click on Extract Interface.*/

public class Architect {

    public static void main(String[] args) {
        BedRoom room1 = new BedRoomBuilder().setDimension(new Dimension(200, 300)).setCeilingHeight(132).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(2).setIsDouble(true).setHasEnsuite(true).createBedRoom();
        BedRoom room2 = new BedRoomBuilder().setDimension(new Dimension(200, 300)).setCeilingHeight(132).setFloorNumber(2).createBedRoom();
        BedRoom room3 = new BedRoomBuilder().setDimension(new Dimension(200, 300)).createBedRoom();
    }
}
