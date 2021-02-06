package lak.designPatterns.creational.abstractMethodPattern.bikeFactoryExmpl;

/*. First of all, there are a couple of abstract classes called Tire and Handlebar. These are parts of the bike and
they are abstracts because different types of bike will have different concrete implementations. */
public abstract class Tire {

    abstract void getDescription();
}
