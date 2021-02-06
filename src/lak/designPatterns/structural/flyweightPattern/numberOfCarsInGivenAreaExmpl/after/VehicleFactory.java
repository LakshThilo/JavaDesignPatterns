package lak.designPatterns.structural.flyweightPattern.numberOfCarsInGivenAreaExmpl.after;

import java.util.HashMap;

/*The first thing I need to do in this method is check if the hashmap already has a key for the number I'm passing in.
So I'll say if vehicles.containsKey and pass in type. And if this is true, then that means I've already created this object.
So all I need to do here is return vehicles.get and pass in type. Now I need to add to the else block. In this case,
the object doesn't exist yet. So I'm going to create a vehicle variable which I'll call vehicle. Then I'll check if
type is equal to zero. If it is, then I'll assign the vehicle object to a new car object. Otherwise it must be a one,
so I'll assign vehicle to a new truck object instead. Next, I need to add the vehicle to my hashmap with the type as
the key and the vehicle object as the value. This means that if this method gets called multiple times and that vehicle
type is already created, then it won't be created again. It will be caught in my first if statements up here at the top
and be returned here. So under the second else block, I will do vehicles.put and pass in the type and the vehicle object.*/

public class VehicleFactory {

    HashMap<Integer, Vehicle> vehicles = new HashMap();

    public Vehicle getVehicle(int type){
        if(vehicles.containsKey(type)){
            return vehicles.get(type);
        } else {
            Vehicle vehicle;
            if(type == 0){
                vehicle = new Car();
            } else {
                vehicle = new Truck();
            }
            vehicles.put(type, vehicle);
            return vehicle;
        }
    }
}
