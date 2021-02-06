package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

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

        Square square = new BlueSquare();
        square.draw(graphics);

        Circle circle = new RedCircle();
        circle.draw(graphics);

        Triangle triangle = new GreenTriangle();
        triangle.draw(graphics);

    }

}
