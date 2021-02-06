package lak.designPatterns.behavioral.mediatorPattern.ecommerceBuyingandSelling.after;

/*In this example, I have an app from E-commerce site that's used for buying and selling objects. The objects are tightly coupled.
And I want to restructure it to make it more maintainable. */

/**  you might have noticed that the customer class had an E-commerce site field, and the E-commerce site class has a customer field.
 * So there's a sort of circular dependency here, which is definitely a code smell.*/

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.buy("pencils",60);
        mediator.buy("pen",50);
        mediator.buy("erasers",60);
    }

}
