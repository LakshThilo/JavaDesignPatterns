package lak.designPatterns.behavioral.chainOfResponsibilityPattern;

public class ChainOfResponsibility_Pattern {


    /* If we have situation where you have some code that need to make a request, but you don't know until run time,
     which object will be handling the request, you might want to consider using the chain of responsibility pattern */

    /*
    As a real world example, imagin someone is using a software application and they find a bug,they need to tell
    someone about it so that the bug will get fixed.they raise a support ticket in an online support system And that
    gets picked up by a live support worker.as this a bug in the software, they then need to tell the product manager
    about the bug and pass on the details to them.
         * then they decide they want to prioritized getting it fixed.
         * so they asked a developer to fixed it, that developer is working on something else, they don't have time to fixed it

         but they do know another developer who does have the time so they pass it on to them. they will fix the bug
         In this situation the request to fix the bug is potted on the long chain, from the person who found it to the developer who fixed it.

         ** This is the concept of Chain of Responsibility Pattern.

         In Java Applications, the chain of responsibilities is used to pass along request to different objects until it finds the one that can handle it.
         The main benefits of this pattern is that it decouples the sender of the request from the receiver.
         Example of used cases for this in Java include,
            - handling authentication where different types of authentication might be needed,
            - separate filters for processing HTTP requests and
            - things like buttons and used interfaces, where the action taken when it's clicked depends on the context.
    */

    /** Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
        Upon receiving a request, each handler decides either to process the request or to pass it to the next handler
        in the chain.*/
}
