package lak.designPatterns.structural.flyweightPattern.wildLifePopulation.after;

import java.util.HashMap;

public class AnimalFactory {

    HashMap<Integer, Animal> animals = new HashMap<>();

    public Animal getAnimals(int type){
        if(animals.containsKey(type)){
            return animals.get(type);
        } else {
            Animal animal;
            if(type == 0){
                animal = new Lion();
            } else {
                animal = new Tiger();
            }
            animals.put(type, animal);
            return animal;
        }
    }
}
