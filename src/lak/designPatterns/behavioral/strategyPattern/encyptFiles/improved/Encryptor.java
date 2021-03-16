package lak.designPatterns.behavioral.strategyPattern.encyptFiles.improved;

/*  So let's see what this would look like. The structure of the strategy pattern is fairly straightforward.
    You would have the context, which maintains a reference to the strategy objects. The strategy is usually
    defined as an interface, and then there are different concrete implementations for the different strategies.
    This is cleaner than having all of the strategies defined inside the client, and allows them to be used interchangeably
    at runtime. Since this pattern was first described by the Gang of Four, new features in Java have been implemented
    which make this pattern even simpler to implement. With the use of Java 8 features, such as lambdas and static methods
    in functional interfaces, we can actually remove the need for the concrete implementations of the interface altogether.
    I'll be demonstrating how this works in my examples.*/

public interface Encryptor {

    String encryptFile();
}
