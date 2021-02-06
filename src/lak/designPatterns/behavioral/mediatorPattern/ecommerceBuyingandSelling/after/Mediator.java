package lak.designPatterns.behavioral.mediatorPattern.ecommerceBuyingandSelling.after;
/** This is a better solution to the one I started with because the customer,
    the ECommerceSites and the driver, and now all decoupled from each other.
    All of the interactions are handled in one place in the mediator class instead.*/
public class Mediator {

    private Customer customer;
    private ECommerceSite site;
    private Driver driver;

    public Mediator(){

        customer = new Customer("234 middle more road");
        site = new ECommerceSite();
        driver = new Driver();
    }

    public void buy(String item, int quantity){
        if(site.cheInStock(item, quantity)){
            site.sell(item, quantity);
            driver.deliver(item, quantity, customer);
        }
    }
}
