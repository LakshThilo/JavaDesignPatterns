package lak.designPatterns.structural.decoratorPattern;

public class Decorator_Pattern {

    /*
        The decorator pattern is a similar principle to decorating something in real life, where you have an object that's already created,
        like a Christmas tree or a cake, and you want to add some decorations to it.
        Imagine a bakery where cakes are baked and sold and the baker has different recipes for chocolate cakes, lemon cakes, cupcakes and so on.
        Suppose one day someone decides they want to order some cupcakes with a really specific pink icing on it. The baker wouldn't write a whole
        new recipe for cupcakes with pink icing. They would use the same cupcake recipe as normal but they would just add the icing on top after.

        A similar situation also applies in software. If you are representing this in Java code, you might have an interface called cake and
        beneath that the different types of cake. How would you handle the situation where you need a cupcake but with pink icing on it? One
        way would be to use inheritance and make the cupcake class inherit from a pink icing interface, too. But this approach has some drawbacks.
        The choice of having pink icing is made statically and I can't then control how and when the icing gets added. Also, if I wanted to add
        another decoration type, for example, sprinkles, I'd have to inherit from yet another interface.

         A cleaner solution would be to enclose the cupcake object in another object that adds the icing. This allows you to change the behavior
         of this cupcake object without affecting other cupcake objects. It also means that the single responsibility principle is a doozy.
         The behavior that's specific to cakes with pink icing is encapsulated inside the pink icing cake class instead of the cupcake class.*/

      /** So, you would use the decorator pattern when you want to add additional responsibilities to an object dynamically.
         The decorator pattern is a more flexible way of achieving this than with subclassing.*/
}
