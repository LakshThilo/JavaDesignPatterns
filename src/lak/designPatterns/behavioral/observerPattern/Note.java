package lak.designPatterns.behavioral.observerPattern;

public class Note {

    /*
      As the name of this pattern suggests, the observer pattern is all about objects watching  or observing other objects.
      In object-oriented design, you often end up with a system broken up into lots of classes that work together.
      One of those challenges is making those classes interact and cooperate while avoiding tight coupling between them.
      The observer pattern provides a way to do this. You have an object that's being watched called the subject
      or the observable and then you have the observers, which watch the object.

    * As a real-life example, think about sites where you're connected to people or fellow people, like on LinkedIn,Facebook, Twitter,
      Instagram and so on. You'll see their activity in your feed or if you post something, rather than sitting and watching to see if
      anyone comments, you will receive a notification if someone does.

      In this example, the post is the observable and you are the observer. The observer pattern is quite a common pattern in
      Java applications. You would use it when you have one or more objects that need to be notified of changes made by another
      object and updated accordingly.

      For example,
      - if you have a graphical user interface that shows several different types of charts, you would want them all
        to update when the data is updated.

      - Other examples could include a user interface where you have a button and when it's clicked, parts of the interface have to be updated.

      - Or for example, you have an application that has a list of people on a waiting list for a product to be in stock and they all
        need to be notified when it becomes available

    *  In Java, you may have come across classes called observer and observable, which have been commonly used to implement the observer pattern in Java.
       However, these were deprecated in Java 9 and are no longer recommended for use. One of the problems was that they could be used to tell you that
       something had changed but they didn't give you any details about what had changed. Instead, it's recommended to implement the observer pattern
       with a PropertyChangeListener and PropertyChangeSupport classes, which is what I'll be using in the following example.
    * */

}
