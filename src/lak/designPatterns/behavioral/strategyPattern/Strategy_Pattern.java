package lak.designPatterns.behavioral.strategyPattern;

public class  Strategy_Pattern {

/** Say you have a group of algorithms and you want to choose which one to use dynamically at runtime. */

/*  In the strategy pattern, the word strategy usually refers to an algorithm, and it allows you to do just this,
    to define a family of algorithms and make them interchangeable.*/

    /* As a real life example, say you have a video game, and the person you're controlling has different powers they can use.
    For example, they can fly, they can climb things, they can swim, and so on. The action the player takes or the strategy
    they use will depend on the situation they find themselves in during the game. They'll need to decide dynamically
    which one to use. This is a bit like how the strategy pattern works. */

    /** In Java, there are many different scenarios where you might use the strategy pattern. For example,
        - if you want to encrypt files, but have different ways of encrypting them depending on the situation, or
        - if you have different types of validation that you could use or
        - different sorting algorithms that you want to use, or
        - want to save to different file types, and so on. This is quite a common pattern in Java, and it's relatively simple to implement.*/

/* So let's see what this would look like. The structure of the strategy pattern is fairly straightforward.
    - You would have the context, which maintains a reference to the strategy objects.
    - The strategy is usually defined as an interface, and then there are different concrete implementations for the different strategies.

    This is cleaner than having all of the strategies defined inside the client, and allows them to be used interchangeably at runtime. Since this pattern was first described by the Gang of Four, new features in Java have been implemented which make this pattern even simpler to implement. With the use of Java 8 features, such as lambdas and static methods in functional interfaces, we can actually remove the need for the concrete implementations of the interface altogether. I'll be demonstrating how this works in my examples.*/

}
