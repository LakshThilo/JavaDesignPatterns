package lak.designPatterns.behavioral.mediatorPattern.ecommerceBuyingandSelling.after;

public class Driver {

    public void deliver(String item, int quantity, Customer customer) {
        System.out.println(quantity+ " "+ item+" out for delivery to "+ customer.getAddress());
    }
}