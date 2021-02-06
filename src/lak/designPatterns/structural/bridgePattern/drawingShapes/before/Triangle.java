package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

import java.awt.*;

public abstract class Triangle extends Shape {

     public void draw(Graphics graphics) {
        int[] x = {200, 250, 150};
        int[] y = {15, 65, 65};
        int n = 3;
        graphics.fillPolygon(x, y, n);
    }

}
