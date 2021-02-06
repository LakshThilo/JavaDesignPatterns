package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

import java.awt.*;

public class GreenTriangle extends Triangle{

    public void draw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        super.draw(graphics);
    }

}
