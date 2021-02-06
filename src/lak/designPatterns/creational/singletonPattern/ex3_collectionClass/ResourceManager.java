package lak.designPatterns.creational.singletonPattern.ex3_collectionClass;


import java.util.Collections;
import java.util.List;

/*
        There are several examples of the singleton pattern from the Java API itself, and a similar effect is used with Java's
        Collections class. The Collections class itself is not an example of the singleton pattern, but the class comes with
        three methods that can be used to create singleton collections. These are singletonList, singletonMap, and singletonSet.
        These methods return an immutable collection. SingletonList returns a list, singletonMap returns a map, and singletonSet
        returns a set. They all return collections that contain only one object, and no new objects can be added to them. Using
        these methods does not turn the collection into a singleton, because it does not stop you creating new collections, but
        like a singleton, it does provide a single point of access that always returns the same instance. */

public class ResourceManager {


    /* In the main method of the ResourceManager class, a PrintSpooler is created, and a list to hold the single PrintSpooler is
    also created. Instead of adding a printer to the list, the singletonList method of the Collections class is called. This turns
    the list of print spoolers into an immutable list and no more print spoolers can now be added to it. If I create a second
    PrintSpooler object, and then try to add it to the list, I don't get an error warning in the IDE. However, let's see what
    happens when I run the program. I get an unsupported operation exception. This is because I have attempted to add a second
    object to a singleton list. It has now been ensured that only one PrintSpooler is in the list. This means that the ProcessResources
    method can be used with a list that I know only has one PrintSpooler in it.*/
    public static void main(String[] args) {

        PrintSpooler spooler = new PrintSpooler();

        List<PrintSpooler> spoolers = Collections.singletonList(spooler);

        processResources(spoolers);

        PrintSpooler spooler2 = new PrintSpooler();
        spoolers.add(spooler2);

    }

    /* The ResourceManager class has a method called processResources, which takes a list of resource managers as an argument.
    For example, it might take a list of network drive connectors, or a list of print spoolers, and process them in some way.
    However, we want to be certain that only one PrintSpooler is used at a time. The processResources method still needs to be
    passed a list as a parameter to be used, even if there is only one object in it. Even though there is only one PrintSpooler,
    it still needs to be added to a list. Otherwise, we can't call the processResources method and pass in a PrintSpooler. One
    option is to just make a list anyway and add the one PrintSpooler, but a better option would be to use the singletonList
    method in the Collections class
    This uses less memory than creating an array with only one object in it. It also prevents any other print spoolers from being added to the list.*/

    public static <Type> void processResources(List<Type> list){

        for (Type p : list) {

        }
    }
}
