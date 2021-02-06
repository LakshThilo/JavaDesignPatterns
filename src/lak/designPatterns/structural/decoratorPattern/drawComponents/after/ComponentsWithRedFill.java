package lak.designPatterns.structural.decoratorPattern.drawComponents.after;

import java.awt.*;

public class ComponentsWithRedFill implements Component{

    Component component;
    private int x;
    private int y;

    public ComponentsWithRedFill(Component circle){
        this.component = circle;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(component.getX(), component.getY(), 50, 50);
        component.draw(graphics);
        graphics.setColor(Color.BLACK);

    }

    @Override
    public int getX() {
        return component.getX();
    }

    @Override
    public int getY() {
        return component.getY();
    }
}
