package lak.designPatterns.structural.bridgePattern.drawingShapes.before;

import java.awt.*;

public class RedSquare extends Square{


    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        super.draw(graphics);
    }

}
