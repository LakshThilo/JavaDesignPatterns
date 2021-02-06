package lak.designPatterns.structural.flyweightPattern.wildLifePopulation.before;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PopulationSimulator {

    static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {

        Runnable createAnimals = new Runnable() {
            @Override
            public void run() { createAnimal(); }
        };

        Runnable removeAnimals = () -> removeAnimal();

        /* There's a scheduled executive service to make these run every few seconds*/
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createAnimals, 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(removeAnimals, 5, 5, TimeUnit.SECONDS);

    }


    private static void createAnimal() {

        Random random = new Random();
        int randInt = random.nextInt(2);
        Animal animal = null;
        if(randInt == 0){
            animal = new Lion();
        } else if(randInt == 1) {
            animal = new Tiger();
        }

        animal.setLocation(random.nextInt(1000), random.nextInt(1000));
        System.out.println("Creating "+ animal+ ", type: "+ animal.getAnimalType() +
                ", location: "+ animal.getLocation()[0]+ " "+ animal.getLocation()[1]);

        animals.add(animal);
    }

    private static void removeAnimal() {

        System.out.println("Removing "+ animals.get(0));
        animals.remove(0);
    }

}
