package lak.designPatterns.creational.prototypePattern.mutability_expl.modify;

public class Rabbit implements Cloneable {

    public enum Breed{
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH

    }

    private int age;
    private Breed breed;
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
    }

    public Rabbit() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    //modify
    @Override
    protected Rabbit clone() {
        try {
            Rabbit rabbit = (Rabbit) super.clone();
            /* It has assigned the results of calling owner.clone. This means that the cloned rabbit still has the same owner as the original,
             but it is a cloned version of the owner rather than the exact same owner*/
            rabbit.owner = owner.clone();
            return rabbit;
        } catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }
}
