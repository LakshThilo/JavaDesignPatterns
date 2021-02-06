package lak.designPatterns.structural.bridgePattern.drawingShapes.after;

import java.awt.*;

public class BlueColorShape implements ColorShape{
    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.BLUE);
    }
}
