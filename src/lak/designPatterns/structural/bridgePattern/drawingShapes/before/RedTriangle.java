package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

import java.awt.*;

public class RedTriangle extends Triangle{

    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        super.draw(graphics);
    }

}
