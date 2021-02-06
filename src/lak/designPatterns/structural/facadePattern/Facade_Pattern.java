package lak.designPatterns.structural.facadePattern;

public class Facade_Pattern {

    /* Sometimes you'll have an app. That's has lots of complex functionality and you want to hide that complexity behind
    an interface, so it's easier to use.
    A real world example of a facade is a plug socket. Behind a plug socket there are wires and connections that most people
    don't understand. But on top of this is the plug socket that you see, and everyone knows how to use.
    The plug socket, in this case, is the facade. You only need to know that you can plug things into a plug socket and
    you don't need to know what's going on behind the scenes.

    Another classic real world example of this is an operating system on a computer or a phone or a tablet.
    When you click on a button to open up an app on your phone, you don't see all the work the operating system is doing
    in the background. All you see is that you clicked on the button and the app has opened on your screen.

    In a Java app you might have lots of classes that do lots of complicated stuff under the hood. If someone wanted to
    use your app, they might have to interact with loads of different classes that do loads of different bits of functionality.
    A facade is an object that sits in between the complex app and the code trying to use it. This means that the client
    only has to interact with one object, the facade, instead of potentially several classes.

    So the main benefits of the facade pattern are that it makes it easier to use complex code. And it means there is loose
    coupling between the clients and the complex code. It also doesn't stop clients from using all the classes that are in
    the complex code, if they want to. The facade is optional and the complexities can always be accessed in the same way
    as before, if need be.*/
}
