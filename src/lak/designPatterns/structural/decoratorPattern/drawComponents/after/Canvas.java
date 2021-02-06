package lak.designPatterns.structural.decoratorPattern.drawComponents.after;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    /* This is an app that draws components on a canvas, which is a real-life example of where the decorator pattern can be used when I want to extend the app*/

    Component circle1 = new Circle(15, 15);
    Component circle2 = new Circle(75, 15);
    Component circle3 = new Circle(135, 15);


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

        /* Let's say I want just the middle cycle, to have a red border and the others to stay the same. To do this I can
        go to my canvas class and scroll down to the paint method, and I'll put a new line above where I'm drawing cycle two.
        I want cycle two to have a red border.*/
        circle2 = new ComponentsWithRedBorder(circle2);
        circle2 = new ComponentsWithRedFill(circle2);
        circle2.draw(g);
        circle3.draw(g);

        /*So I've dynamically changed the color of the circle, without effecting any of the others. If I wanted to do things
        like add stripes to the shapes, or make them 3D, or make them twice the size, I could add decorators for all of these
        things too. I could also NS them. So if I wanted a circle with a red border and a yellow fill color, I could create a
        decorator called, say companion with yellow fill, and then pass in the circle with the red border*/
    }
}
