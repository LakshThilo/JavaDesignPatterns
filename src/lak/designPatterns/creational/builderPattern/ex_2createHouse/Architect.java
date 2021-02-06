package lak.designPatterns.creational.builderPattern.ex_2createHouse;

import java.util.ArrayList;

/*  The builder pattern can also be used for when the program has complex constructions. In this example, the architect
    class is used to create a house. The house takes a list of rooms as its constructor. The room objects are created using
    a room builder class, which is good, because that means there is no need to use a long and complex constructor. The rooms
    can have as many or few characteristics specified as needed. However, creating a house is still quite complex. Each new
    room has to be created individually. Then, a new array list has to be created to store the rooms. And then, each room
    needs to be added to that array list. Only then can a house object be created. The builder pattern has already been
    used to simplify creating a room, but it can be used again, to simplify this further. */

public class Architect {

    public static void main(String[] args) {

        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();

    /*    ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        House house = new House(rooms);*/

    /** So in the architect class, the code to create a new list and add each room can be replaced with a single line of
     * code that uses the RoomListBuilder. In a single line, the list of rooms is created, all the rooms are added to
     * the list, and the list is built*/

    ArrayList<Room> rooms = new RoomListBuilder().addList()
            .addRoom(room1)
            .addRoom(room2).
            buildList();

    }

    /**
       This could be still further enhanced if the rooms could be built while the list of rooms is being built.
       Then the whole process of creating the list of rooms would be in a single line of code. To achieve this,
       both the RoomListBuilder class and the RoomBuilder class have been changed slightly. Firstly there is a
       second addRoom method in RoomListBuilder. Instead of taking a room as a parameter and adding it to the list,
       it just returns a new RoomBuilder. In Java, it is okay to have two methods with the same name if they take
       different parameters. Note that the RoomListBuilder needs to be a field of the RoomBuilder class, and also
       that there needs to be a second constructor of the RoomBuilder class that takes a RoomListBuilder as a parameter.
       Then, there is a method that adds the room to the list of rooms. The first thing this method does is build the room.
       Then it adds the room to the list and returns the list. Now that these two methods have been added, it is much
       simpler to create a list of rooms in the architect class. */

    ArrayList<Room> rooms = new RoomListBuilder().addList()
            .addRoom().setFloorNumber(2).addRoomList()
            .addRoom().setFloorNumber(1).addRoomList()
            .buildList();

    //The code to create the room classes at the top of the method are no longer needed.
    House house = new House(rooms);
}
