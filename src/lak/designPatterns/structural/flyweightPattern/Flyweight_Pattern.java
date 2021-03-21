package lak.designPatterns.structural.flyweightPattern;

public class Flyweight_Pattern {

        /*  Suppose you have hundreds of small objects in your application that use uploads of memory.
    The Flyweight Pattern uses sharing to make apps like these work more efficiently.
    Imagine a program that's used for creating and editing text documents. A user opens a document and starts typing on it.
    In an object-oriented design, you could have a new objects for each character. So every time they typed an A, you would
    create a new A object. That would be a lot of objects. If they opened up a document that was hundreds of pages long,
    there might be a million separate letter objects.

    This situation might lead to the dreaded java.lang.OutOfMemory error. That's all Java developers are familiar with.
    Also in Java, it doesn't take long to create objects. In fact, it's actually pretty quick, but there is definitely an
    opportunity here to maximize performance.

    This is where the Flyweight Pattern can help. Instead of having a separate object for A, B, C, D, E, and so on, you
    could have one share object for all the A's and one for all the B's, and so on. This is okay because all A's look the same.
    They have the same character code and shape and so on, but they won't all have the same position on the documents.
    That will be different for each one.

    This is the difference between intrinsic and extrinsic states. The character code is intrinsic because it's the same
    for every letter A, for example, but the position on the document is extrinsic, because it will be different for everyone.

    Flyweight objects allow you to share the intrinsic states, so the stuff is the same for every object. Information about
    the extrinsic states can be passed to the Flyweight objects when it needs it. The Flyweights objects can't make any assumptions
    about the external states, but apart from that, it should behave in the same way as an object that's not shared, You should be
    able to use it in multiple places at the same time as though they were separate objects.*/

}
