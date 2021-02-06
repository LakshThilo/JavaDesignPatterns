package lak.designPatterns.creational.prototypePattern.mutability_expl.modify;

public class Main {

    /* In the main class, a rabbit object is created. The owner of the rabbit is set to a person called Sally and then
    a second object called rabbitCopy is created, which is a clone of the first rabbit. It then prints out the names
    of the owners of both the original rabbit and the cloned rabbit.*/
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Sally");
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of first owner: "+rabbit.getOwner().getName());
        System.out.println("Age of second owner: "+rabbitCopy.getOwner().getName());

        // If the name of the cloned rabbit's owner is changed to Steve, the result is quite unexpected.
        /** The name of the original rabbit's owner has changed too. This is a problem. The clone's object should be independent of the original, but changing the clone changes the original too. This is because they still share the same person object. This problem can be solved by modifying the clone method. Firstly, the person class also needs to implement Cloneable. It then also needs to overwrite the clone method, the same as with the rabbit class. It creates a new person by calling super.clone and passing the returned objects to person. Next, in the Rabbit class, the clone method also needs modifying. The owner of the cloned rabbit should be set to a clone of the original rabbit's owner. I need to add a line of code that sets the rabbit's owner. It has assigned the results of calling owner.clone. This means that the cloned rabbit still has the same owner as the original, but it is a cloned version of the owner rather than the exact same owner.*/
        rabbitCopy.getOwner().setName("Steve");
        System.out.println(rabbit.getOwner().getName());
        System.out.println(rabbitCopy.getOwner().getName());
    }
}
