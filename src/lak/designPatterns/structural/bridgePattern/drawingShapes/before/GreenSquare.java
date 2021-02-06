package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

import java.awt.*;

public class GreenSquare extends  Square{

    public void draw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        super.draw(graphics);
    }
}
