package lak.designPatterns.creational.builderPattern.ex1_createRooms.refactoredWithBuilder;

import java.awt.*;

/** On the left of the screen, there is a menu called Projects. First, I need to right-click on the BedroomBuilder class in the Projects menu. I then go to Refactor, and click on Extract Interface.*/

public class Architect {

    public static void main(String[] args) {
        BedRoom room1 = new BedRoomBuilder().setDimension(new Dimension(200, 300)).setCeilingHeight(132).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(2).setIsDouble(true).setHasEnsuite(true).createBedRoom();
        BedRoom room2 = new BedRoomBuilder().setDimension(new Dimension(200, 300)).setCeilingHeight(132).setFloorNumber(2).createBedRoom();
        BedRoom room3 = new BedRoomBuilder().setDimension(new Dimension(200, 300)).createBedRoom();
    }
}
