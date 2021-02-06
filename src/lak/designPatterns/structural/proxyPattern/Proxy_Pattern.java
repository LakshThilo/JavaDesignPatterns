package lak.designPatterns.structural.proxyPattern;

public class Proxy_Pattern {

/*
    What if you want to use a class that belongs to a third party app, but it doesn't fit with your app because of incompatible interfaces.
    The adapter pattern provides a way for classes to work together that normally wouldn't be able to.

    So imagine you have a plug, that you can use to plug in different USB cables. So you can use the plug to charge a range of different
    devices like your phone, and your tablets, and your fitness watch. But when you go abroad, the plug doesn't fit in the socket and you
    can't use it to charge anything. So instead you can use a plug adapter and the adapter allows you to charge all of your devices abroad.

    If this real world example was written in Java code,
        -the charge would be an interface.
        - Then the concrete glasses would be the phone charger, the tablet charger, and the watch charger, which can then charge all of these devices in the U.S.

    Say someone else has written some code for charging phones in Europe, but their code doesn't know about our charger interface.
    So I can't use charger objects and the European phone charger interchangeably. Using the adapter pattern, I can create an adapter
    object that inherits from the charger interface, but contains the implementation of a European phone charger.

    Another option would be to change the source code of the class that you're trying to use, but this isn't always possible.
    It might be third party code that you don't have access to. And even if you did have access to the third party code, you
    shouldn't have to hack it just to make one application work. The code might be our own code, but it might be legacy codes
    that you need to reuse and you've decided that you don't want to change it.

    So you would use the adapter pattern when you want to use an existing class, but it doesn't fit into your class hierarchy.

    There are some examples of this pattern in the JDK itself. For example,
        - the collections class has two methods lists and enumeration, which use the adapter pattern to provide compatibility with Legacy APIs
        that work with the enumerations.

        - Another example is the as list method of the arrays class, which uses the adapter pattern to allow array based and collection based APIs to work together.
*/
}
