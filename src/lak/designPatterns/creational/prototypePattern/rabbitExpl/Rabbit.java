package lak.designPatterns.creational.prototypePattern.rabbitExpl;

/*The most common way to implement the prototype pattern in Java is with the Cloneable interface. In this example there is a class called rabbit.
*  The purpose of the prototype pattern is to be able to make exact copies of a single rabbit object */
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

    /*  in the main class a rabbit could be created and its age could be set to two months and its breed to Himalayan.
        Then, if it is cloned, the new rabbit should have the same age and the same breed as the original rabbit.
        In order to do that the first thing to notice about the rabbit class is that it implements the Cloneable interface.
        Secondly, the rabbit class needs to override the clone method. Inside the clone method a new rabbit is created by
        calling super.clone. The return type for the clone method is objects so this should be cast to rabbits.
        The next requirements of the Cloneable interface is that the clone method has to throw a clone not supported exception.
        If I do this, I will have to surround any codes that uses the clone method with a try catch. So an alternative is
        to use try catch here instead. If the exception is thrown, the code will simply throw an assertion error. */

    @Override
    protected Rabbit clone() {
        try {
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }
}
