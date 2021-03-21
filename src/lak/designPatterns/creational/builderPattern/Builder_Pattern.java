package lak.designPatterns.creational.builderPattern;

public class Builder_Pattern {

    /** The main purpose of the builder pattern is to avoid having complex constructors.*/
    /*
        The main purpose of the builder pattern is to avoid having complex constructors. In general, you should avoid having
        a constructor that takes a large number of parameters. Long lists of parameters are confusing and do not give you much
        flexibility when creating a class.

        Consider the case of a class representing a person. Each new person created will have a unique combination of characteristics.
        For example, each person will have a name, age, hair color, eye color, occupation, nationality, and so on and so forth.
        In a Java application, every time a person was created, all of this information would have to be passed into the constructor.
        This is a very long list that needs to be supplied, and it is easy to see how items might be put in the wrong order.
        There might also be times in the application where not all of the information is needed. You might need to create a
        person but only want to specify their name. To create a person you would still have to supply all of the other information
        about their hair color, nationality, current city, etc.

        One way to fix this problem is to have multiple constructors. They could be one that takes all the parameters and another
        that takes just the name. Then if one was needed there could be another constructor that takes just the first two parameters, name and age.
        Then there could be one that takes the first three and then the first four and so on until all the parameters are added.
        This technique is called the telescoping constructor pattern. The problem with this technique is the class ends up having a
        very large number of constructors. There may be times when you want to specify other combinations, for example, just nationality
        and date of birth. To have a constructor for every possible combination of eight parameters there would be 254 different constructors.
        This solution does work and there would be a great amount of flexibility in creating person objects. But the person class would be
        extremely long and complex just from the number of constructors. It would take a long time to write all those codes and it would be
        difficult for other people to read and understand.

        The builder pattern is a much better alternative to solving this problem. It keeps all the flexibility of the telescoping approach
        but without the complexity. It moves the construction of complex objects out of the constructor. It also allows for different combinations
        of fields with one single construction process. Classes that use the builder pattern scale much better and are far easier to read in this scenario.

    */
}
