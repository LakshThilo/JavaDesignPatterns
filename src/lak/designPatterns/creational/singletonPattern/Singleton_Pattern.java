package lak.designPatterns.creational.singletonPattern;

public class Singleton_Pattern {

    /*
        The Singleton pattern should be used when you want to make sure that only one instance of a class can be created.
        There might be times when you want to make it impossible to create multiple instances of a class while still making
        sure that there is a way to access that one instance.

        So in what situation would you need to do this? Some typical examples include window managers, database connectors,
        file managers, user interface dialogs, and resource accessors and spoolers. Say, for example,
        that you have a class that controls access to a resource like a printer. You might have multiple printers,
        but you would want to make absolutely sure that only one instance of the class that controls access to them could be created.
        If there are multiple print spoolers, they might try and allow two different processes access to the printer at the same time.
        Or say you had a logging class that needs to be used repeatedly by all the files in your project. Again, you would want to
        make sure that there was only one instance of that logging class. Having multiple instances might cause your program to give
        incorrect results, behave strangely, or crash.

        The solution to this problem is to use the Singleton pattern so that only one instance of the print spooler, or the logging class,
        could be created. There are some examples of the Singleton pattern in the Java API. For example,
            - the Desktop class,
            - the System class, and
            - the Runtime class.
        Every Java application has one, and only one, instance of Runtime, which can be accessed with the public method get Runtime.

        The Singleton pattern is perceived as one of the simpler creational design patterns and it is fairly straightforward to understand
        the concept, but it shouldn't be overused. If you find that you have lots of examples of the Singleton pattern in your code,
        it might be a better option to refactor.

        However, it is a well-known pattern and an important concept to understand, and there are many situations when it comes in useful.*/
}
