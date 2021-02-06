package lak.designPatterns.creational.prototypePattern.mutability_expl.before;

/*The Rabbit class has fields for age and breed and also a field called owner, which is of type Person. The SetOwner
method in the Rabbit class takes a parameter of type string and creates a new Person object whose name is the string.
The Rabbit class also has a clone method that creates a copy of the rabbit it is called on. */
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

    @Override
    protected Rabbit clone() {
        try {
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }
}
