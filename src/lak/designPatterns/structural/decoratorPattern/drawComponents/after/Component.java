package lak.designPatterns.structural.decoratorPattern.drawComponents.after;

import java.awt.*;

public interface Component {

    void draw(Graphics graphics);
    int getX();
    int getY();
}
