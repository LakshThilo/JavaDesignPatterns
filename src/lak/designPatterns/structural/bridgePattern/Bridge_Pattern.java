package lak.designPatterns.structural.bridgePattern;

public class Bridge_Pattern {

    /*  Imagine you have a Java app that uses lots of inheritance. It starts off as a nice, simple tree with a parent and
        a few children. Over time, you find that you need to add another level, and then someone else comes in and adds a
        level in between some of yours.
        A week later, you come into work and you have a huge inheritance tree that looks something like this. No one understands it,
        and it's well on it's way down the road to legacy code. Then someone new joins the team and you spend the next six months
        explaining the structure of your code base to them.

        Sometimes using the bridge pattern can help to simplify inheritance structures, making them more flexible and adaptable. */

    /*  A classic roll off example of where the bridge pattern can be used is in a graphical user interface. You have interface
        called shape, and underneath you have some classes such as circle and square. Then you might decide that you want to have
        different color shapes, so the next logical step is to extend the inheritance tree to have a blue circle, a red circle,
        a blue square, and a red square.
        Then you might decide that you want some green shapes as well. So you go ahead and make a green circle class and a green
        square class. Every time you want to add a color, you have to make two new classes. And then you decide you need to be
        able to draw triangles. Now you need to create a triangle class and another sub class for every different color.
        Suddenly, you have this really big complex tree again. If you want to make a change to how red shapes are implemented,
        you have to go and change every red shape class. And if you want to add a new shape or a new color, you have to add lots
        of new classes. */

    /*  Instead, you could use the bridge pattern to separate out your hierarchy and to make your code more flexible. The shape of
        the object can go in a separate hierarchy to the color of the object. This way if you want to add a new shape or new color,
        you only need to create one single new class. The implementation is then captured in that class so if it changes, it only
        needs to change in one place. This also removes a whole layer from the class hierarchy. The bridge pattern enables me to
        instantiate a blue square object,
        for example, without needing to write a blue square class. Instead I can use the characteristics of both the square class
        and the blue shape class. In this way, the bridge pattern can help me to write more maintainable code, it decouples the
        concrete implementation from the interface, and gives me more flexibility.*/
}
