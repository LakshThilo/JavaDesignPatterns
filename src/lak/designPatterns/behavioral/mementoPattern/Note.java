package lak.designPatterns.behavioral.mementoPattern;

/*  Say you want to create an undo operation and to do that, you need to save the states of an object but you don't want
    to break the principle of encapsulation. The memento pattern allows you to do exactly this. There are some cases
    where you need to keep a record of the states of an object.
    For example, say you're writing an the text documents and at some point you click save and then you reword what you've written.
    But later you decide you want to go back to the previous version. You would need to have a record of the state that document
    was in before you saved it. */

/**    This is what the memento pattern does. It's externalizes the state of an object at a given time in case he needs to get back to it later.*//*

*   When I looked at the mediator pattern in the previous chapter, I talked to lots about encapsulation. One of the benefits
    of encapsulation is that it's ensures objects hide their states from other objects. Classes often contain several fields
    that should be kept in a consistent state. If they're encapsulated, it prevents anyone else using the object from messing
    with that states. Encapsulation also means you can change the underlying structure of the objects without causing breaking
    changes for anything else using it. So in the memento pattern you create a copy of that state in a separate object

*  - First of all, you have an object whose states are going to be changing and this is called the originator.
   - Then you have the object which is going to be changing it called the caretaker.
   - The memento object sits between these two. So the objects during the changing has access to the memento,
     which provides the save states. The implementation of the originator stays as a black box.
     The momentum just knows what the state was at a given time.

     -  It's worth bearing in mind that if the object whose states you want to capture contains a lot of data,
     using the memento pattern can result in an increase in memory usage. And this might outweigh the benefits of using it.
     But if the object state is fairly simple and you want to wait to be able to save it and restore it later,
     the momento pattern is a good way to do this without exposing the structure of the objects.*/
public class Note {
}
