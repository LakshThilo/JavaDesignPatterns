package lak.designPatterns.structural.decoratorPattern.drawComponents.after;

import java.awt.*;

public class ComponentsWithRedBorder implements Component{

    Component decoratedComponent;

    public ComponentsWithRedBorder(Component component){

        /* In this app, I'll only be passing in a circle component, but in a more fully implemented version, this could be any type of component.*/

        decoratedComponent = component;
    }

    @Override
    public void draw(Graphics graphics) {

        /* Inside this method I'll do graphics.setColor and I'll set the color to red, and then I'll call the draw method on
        the components field, so I'll do decoratedComponent.draw and pass in the graphics object. Then I'll need to set
        the graphics color back to black. Otherwise, all the shapes I draw afterwards will be red, too. So, I'll do graphics.setColor
        and pass in the color black, so now I have a decorator class that I can use interchangeably with other component objects.*/

        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        graphics.setColor(Color.BLACK);

    }

    @Override
    public int getX() {
        return decoratedComponent.getX();
    }

    @Override
    public int getY() {
        return decoratedComponent.getY();
    }
}
