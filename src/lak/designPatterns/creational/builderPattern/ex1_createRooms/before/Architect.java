package lak.designPatterns.creational.builderPattern.ex1_createRooms.before;



/*      In this example, there is an application with a complex constructor that will benefit from using the builder pattern.
    The application has a class called Bedroom which has eight different fields. It also has an Architect class that can be
    used to create Bedroom objects. In the application's current state, it is only possible to create a Bedroom if all eight
    pieces of information are supplied. None of them are optional, because they are all used in the single constructor of the
    Bedroom class. It is also very difficult to tell what all the different information is about when a Bedroom object is created.
    It is also a requirement of this application to have flexibility. It should be able to create a Bedroom with any combination
    of these pieces of information. */

    /* One option is to go about implementing a different constructor for all of the implementations. This would take a very
    long time to write out, and make our room class very long and messy. */

/** A better idea is to implement the builder pattern. In the builder pattern, there are several components, including a
    director, a product, and a builder.In this example,
        - the director is the Architect class. The director is used for constructing objects using the builder.
        - The product is the complex object that needs to be constructed. In this case the complex object is the Bedroom.
        - The elements that is currently missing from this example is the builder, which is used for constructing the parts of the complex object.  */
public class Architect {

public static void main(String[] args) {
}
}
