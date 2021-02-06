package lak.designPatterns.structural.bridgePattern.drawingShapes.me;

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

            graphics.setColor(Color.BLUE);
            graphics.fillRect(5, 15, 50, 50);

            int[] x = {200, 250, 150};
            int[] y = {15, 65, 65};
            int n = 3;
            graphics.setColor(Color.BLACK);
            graphics.fillPolygon(x, y, n);

            graphics.setColor(Color.RED);
            graphics.fillOval(75, 15, 50, 50);


    }
}
