package lak.designPatterns.creational.abstractMethodPattern;

public class Abstract_Method_Pattern {

    /** The Abstract Factory Pattern provides an interface for creating families of objects without specifying what their concrete types are.*/
    /*
    It should be used when there is a system that creates objects, but how those objects are created should be hidden from view. In particular,
    it is used when applications have families of objects. The application should be able to choose which of a selection of families it wants to use.
    The abstract factory pattern can ensure that family groups are used together.

    Say, for example, there is an application that builds bicycles. First, all of the individual bike parts need to be built. The wheels,
    handlebars, gear and frame, and so on, need to be made, and not just any old parts. To make a mountain bike, for example, you need wheels
    with a strong frame and thick tires. Mountain bikes also need straight handlebars, so these different parts are examples of a family of
    objects that need to be made together.
    The process of making a mountain bike is different to making a road bike, which has different wheels, gears, handlebars and so on.
    It would be wrong to mix up any of the parts for the two bikes. If the road bike had a mountain bike wheel, it would not work very well.
    Both types of bikes have the same kinds of parts, i.e., they both have wheels, but the actual parts themselves are different. This can
    be complex when it comes to representing a bike builder in Java code. A constraint of a bike builder class is that it does not want to
    hard code the parts when a specific bike is built. This would be inflexible and lead to long and complex code all in one place.
    If any changes needed to be made to how a specific type of bike part is built, this code would need to change again.

    The BikeBuilder shouldn't need to care about how the bike parts are built. It just wants to ask for the bike parts and be given them.
    The abstract factory pattern solves this problem by providing an interface for making different types of bikes. In this case, there
    would be an interface called BikeFactory which has two concrete implementations, MountainBikeFactory and RoadBikeFactory, and
    MountainBikeFactory would return a mountain bike wheel, which is a concrete implementation of a wheel interface, and a
    RoadBikeFactory would return a road bike wheel, which is another concrete implementation of Wheel.

    This way, the bike builder does not need to know about how the different parts are made because the concrete classes are isolated from it.
    It also promotes consistency. If the bike builder is using a MountainBikeFactory class, it cannot create any parts other than a mountain bike part.
    If it asks for a wheel, a mountain bike wheel is created and returned. There is no need to specify that a mountain bike wheel is needed, because the
    abstract factory already knows and deals with that. This is a much better way to structure the code.

     */
}
