package lak.designPatterns.structural.decoratorPattern.drawComponents.before;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    /* This is an app that draws components on a canvas, which is a real-life example of where the decorator pattern can be used when I want to extend the app*/

    Component circle1 = new Circle(15, 15);
    Component circle2 = new Circle(75, 15);
    Component circle3 = new Circle(135, 15);


    /* If I run the application, I can see that it creates a canvas on the screen and draws those three circles on it,
        but what if I want to add a red border to one of the circles?
            - One way to do that would be to create a class called something like circle with red border which inherits from circle,
              but circle's a concrete class, so I'd have to make that an interface, but then it wouldn't inherit from the component interface,
            - or I could start a separate interface for components with red borders and then my new circle class could implement that and the
              component interface, but then all of my circle objects that I create would have a red border and I only want a red border on one specific circle.

       The solution to this problem is to create a decorator class,*/

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 400);
        jFrame.add(new Canvas());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }

    @Override
    public void paint(Graphics g) {
        circle1.draw(g);
        circle2.draw(g);
        circle3.draw(g);
    }
}
