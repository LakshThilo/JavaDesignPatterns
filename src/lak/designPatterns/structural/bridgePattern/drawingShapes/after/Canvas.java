package lak.designPatterns.structural.bridgePattern.drawingShapes.after;

import lak.designPatterns.structural.bridgePattern.drawingShapes.before.BlueSquare;
import lak.designPatterns.structural.bridgePattern.drawingShapes.before.GreenTriangle;
import lak.designPatterns.structural.bridgePattern.drawingShapes.before.RedCircle;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics graphics){


        Circle circle = new Circle(new RedColorShape());
        circle.draw(graphics);

        Square square = new Square(new BlueColorShape());
        square.draw(graphics);

        Triangle triangle = new Triangle(new GreenColorShape());
        triangle.draw(graphics);

        Circle circle1 = new Circle(new GreenColorShape());
        circle1.draw(graphics);

        Triangle triangle1 = new Triangle(new BlueColorShape());
        triangle1.draw(graphics);

    }
}
