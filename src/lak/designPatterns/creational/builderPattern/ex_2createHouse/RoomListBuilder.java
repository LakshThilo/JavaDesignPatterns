package lak.designPatterns.creational.builderPattern.ex_2createHouse;

import java.util.ArrayList;

/* The application also has a class called RoomListBuilder, which builds the list of rooms.*/
public class RoomListBuilder {

    private ArrayList listOfRooms;

    /** The first method declared in this class is called addList, and this returns a new array list to store rooms in.*/
    public RoomListBuilder addList(){
        this.listOfRooms = new ArrayList();
        return this;
    }

    /** The second method adds a room to this list.*/
    public RoomListBuilder addRoom(Room room){

        listOfRooms.add(room);
        return this;
    }

    public RoomBuilder addRoom(){
        return new RoomBuilder(this);
    }

    /** And the final method, buildList, returns the list of rooms. */
    public ArrayList buildList(){
        return listOfRooms;
    }
}
