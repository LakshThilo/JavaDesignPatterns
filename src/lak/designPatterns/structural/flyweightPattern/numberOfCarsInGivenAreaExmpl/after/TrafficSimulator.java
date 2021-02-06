package lak.designPatterns.structural.flyweightPattern.numberOfCarsInGivenAreaExmpl.after;

/*  This app, is a simulation of the number of cars in a given area. Simulations are often used in software to model systems
    in the real world, and they can be used to make predictions, so this one simulates traffic in a given area. */

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulator {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    /* I want this to be a field because I want to use the same factory each time. Otherwise if I'm using a new factory,
    I'll be creating new vehicles all the time, which is what I want to avoid.*/
    static VehicleFactory factory = new VehicleFactory();

    public static void main(String[] args) {

        Runnable createVehicles = TrafficSimulator::createRandomCar;

        Runnable removeVehicles = new Runnable() {
            @Override
            public void run() { removeCar(); }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createVehicles, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeVehicles, 5, 5, TimeUnit.SECONDS);
    }


    private static void removeCar() {

        System.out.println("Removing "+ vehicles.get(0));
        vehicles.remove(0);
    }

    private static void createRandomCar() {

        Random random = new Random();
        int randInt = random.nextInt(2);
        System.out.println(randInt);
        Vehicle vehicle = factory.getVehicle(randInt);

        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating "+ vehicle+ ", type: "+ vehicle.getType() +
                ", location: "+ vehicle.getLocation()[0]+ " "+ vehicle.getLocation()[1]);

        vehicles.add(vehicle);
    }

    /* I can see that it behaves the same way as before, with cars and trucks being created with different locations. But if
    I stop it again and look at the output, I can see that the object references for cars are all the same. For example, the
    car I'm creating here has a reference ending in 8a0, and another car I'm creating here also ending 8a0, and another one here
    ending 8a0. And the same for the trucks, this one ends in c24. And the new truck I'm creating hair also ends in c24. So all
    the trucks and all the cars have the same objects references, which shows us that they are the same object. So I'm using much
    less memory because I'm reusing the car and truck objects. But I still get the functionality of seeing different locations for
    each one. This is how the flyweight pattern can help you save memory and applications that are creating large numbers of
    similar objects.*/
}
