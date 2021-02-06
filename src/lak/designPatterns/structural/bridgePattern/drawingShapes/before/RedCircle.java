package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

import java.awt.*;

public class RedCircle extends Circle{

    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        super.draw(graphics);
    }

}
