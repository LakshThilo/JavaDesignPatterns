package lak.designPatterns.creational.factoryMethodPattern;

public class FactoryMethodPattern {

    /*  The factory method deals with the problem of needing to crate objects but not knowing exactly what type of objects
        need to be created. There might be a class that creates new objects, but when the class is written, you want to be
        flexible about the type of objects it creates.
        In fact, the class might have no idea what kind of objects it will want to create.
        For example,
            - say that there is a candy store that sells different types of candy. The owners of the candy store will
            want to buy in stock, but when they open the store, they won't know which candy they will want to buy in the future.
            The job of the store is just to sell candy. It is not the job of the store to get involved with exactly how the candy is created.

        The solution to this problem is to use the factory method pattern. This involves adding an extra class between
        the candy store and the candy. This class has something called a factory method which handles deciding which
        class to return. This means that all the code that decides which candy to make is moved out of the candy store
        and into the candy factory.

        This makes it much easier if the owner of the shop wants to start selling new types of candy. In that case,
        the code in the candy store class does not need to be changed at all anymore. Instead, the candy factory class
        worries about all of this for us. This makes the code much more maintainable. If the factory pattern was not used,
        the code would be much more difficult to maintain. There could be a class called candy store and then an abstract
        class called candy. Then, each different type of candy could be a concrete implementation of the abstract candy class.
        The store needs a way to get the candy.

        The problem is the candy store class needs to create candy objects, as it cannot create them because candy is an
        abstract class. You cannot instantiate an abstract class in Java. But the store just needs to know that it sells
        different types of candy. It doesn't need to know about all of the different kinds of candy available in the world.

        In this scenario, the only way to create a candy object in the candy store class is to specify what type of candy it is.
        One solution is to have a method with lots of if statements.
        For example,
         - if the candy is in the chocolate section, create a chocolate bar;
         - if it's in the lollipop section, create a lollipop.

       The candy store probably sells lots of different types of candy, so it is easy to see that this method is going to get
       long and complicated very quickly. If the store wants to sell a new kind of candy, the code in the candy store itself
       needs to change. Any changes to the way the candy is created or packaged need to be reflected in the code inside the
       candy store, too. Using the factory pattern method avoids these problems.*/
}
