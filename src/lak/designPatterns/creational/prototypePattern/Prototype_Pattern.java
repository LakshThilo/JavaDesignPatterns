package lak.designPatterns.creational.prototypePattern;

public class Prototype_Pattern {

    /*
        The prototype pattern essentially involves making a copy of one original object. It is useful when you want to
        create a new object, but a similar one already exists. In particular, it should be used when you do not want a
        system to know details of how objects are created.
        Say for example,
            - there is an application that simulates a field of rabbits, and the while the application is running,
            the rabbits breed. Instead of creating a new rabbit object each time, it would be easier and more efficient
            to clone a single prototype rabbit.

       This technique is particular useful if creating a new rabbit object is a memory-intensive process. It can make
       the application faster, as well as make the code shorter and cleaner. If the prototype pattern is used and an
       original rabbit is copied. The copied rabbits can then be modified .
       For example,
        - you could clone the original rabbit 10 times, and then give all of the rabbits their own name. This pattern
        should be used when the application using the cloned objects should not need to know about how an object is created.

      It is also useful when classes are loaded dynamically.
      For example,
       - in an application that creates new rabbit objects as it runs, the rabbits are only created once the program has
       started running. This can slow the program down because new objects are being created all the time. But if the
       objects can be cloned, this will save memory.

     Having a prototype in this example is particularly useful because all of the rabbits have very similar characteristics.
     If the aim of the application was to create a different range of rabbits with different names, ages, breed-typed colors
     and weights, then the prototype pattern would be less useful.

     In that case, we could still clone a rabbit, but we would then have to execute a lot of codes to change all of its
     characteristics each time. There would little benefit of cloning over just creating a new rabbit object every time.

     In the classic prototype pattern, there is an abstract prototype class that has a method called clone. There are
     then concrete implementations of the prototype, which overrides the clone method. A client can then create a
     prototype object and obtain copies of it.*/
}
