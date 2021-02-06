package lak.designPatterns.structural.flyweightPattern.numberOfCarsInGivenAreaExmpl.before;

/*  This app, is a simulation of the number of cars in a given area. Simulations are often used in software to model systems
    in the real world, and they can be used to make predictions, so this one simulates traffic in a given area. */

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulator {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {

        Runnable createVehicles = new Runnable() {
            @Override
            public void run() { createRandomVehicle(); }
        };

        Runnable removeVehicles = new Runnable() {
            @Override
            public void run() { removeVehicle(); }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeVehicles, 5, 5, TimeUnit.SECONDS);
    }


    private static void removeVehicle() {

        System.out.println("Removing "+ vehicles.get(0));
        vehicles.remove(0);
    }

    private static void createRandomVehicle() {

        Random random = new Random();
        int randInt = random.nextInt(2);
        Vehicle vehicle = null;
        if(randInt == 0){
            vehicle = new Car();
        } else if(randInt == 1) {
            vehicle = new Truck();
        }

        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating "+ vehicle+ ", type: "+ vehicle.getType() +
                ", location: "+ vehicle.getLocation()[0]+ " "+ vehicle.getLocation()[1]);

        vehicles.add(vehicle);
    }

    /*The longer I run this program, the more vehicle objects will be created. They're created more often than they're
    removed, so many more objects would be created. This would be a good place to use the flyweight pattern, to reduce
    the overhead of creating lots of these objects.*/
}
