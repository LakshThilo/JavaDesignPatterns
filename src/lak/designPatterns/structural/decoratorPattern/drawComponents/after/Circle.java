package lak.designPatterns.structural.decoratorPattern.drawComponents.after;

import java.awt.*;

public class Circle implements Component {

    private int x;
    private int y;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public void draw(Graphics graphics) {
        graphics.drawOval(x, y, 50, 50);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
