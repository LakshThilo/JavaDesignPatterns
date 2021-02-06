package lak.designPatterns.creational;

public class Creational_Design_Pattern {

    /**
     Creational design patterns are a way of structuring code to make it more simple, maintainable, and effective.
     This course will explore how to use creational design patterns to make you a better Java programmer.


     Creational design patterns are used to abstract the process of instantiating objects. They are used in scenarios
     when a system should not be dependent on how objects are created.

     One example could be a game that lets you build houses. It would not be practical to have one long class that has
     all the code for making each different type of room and all the items in the room. It would be much better to
     encapsulate the code for creating the objects in separate ways. There are lots of creational design patterns that
     could be applied to this game. */

    /**  Creational design patterns become more important as systems become more complex. Often over time, it becomes
     * less practical to hard-code a fixed set of behaviors for an object.
     *
      For example, in the house application, at first it might make sense to be specific about how a room is created.
     But as more types of rooms are added, the code would become longer and more complex. Instead, it would be better
     to define a set of behaviors for room objects in general. For example, in an interface.

     Then the main game class only needs to worry about the room interface, rather than the details of how each different
     room is instantiated. Creational design patterns are about defining a small subset of behaviors that can be used for t
     he basis of lots more complex behaviors.

     There are two main themes that are common to most creational design patterns.
     - The first is that they encapsulate knowledge about which concrete class the system should use.
     - The second is that they conceal how objects are created and put together.

     Abstracting this information makes the code much more flexible. The system is much less constrained by what gets created,
     how it gets created and when it gets created. Sometimes there are situations where a number of different creational design
     patterns could be used in a single situation. In a sense, the designs are competing in these instances. At other times,
     it might be possible to use multiple patterns because they work well together and complement each other.*/
}
