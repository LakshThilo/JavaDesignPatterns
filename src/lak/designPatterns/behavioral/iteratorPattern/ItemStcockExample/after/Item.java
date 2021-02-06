package lak.designPatterns.behavioral.iteratorPattern.ItemStcockExample.after;

/*In this example, I have an app that keeps track of stock for a store that sells stationary. I want to be able to iterate over the items and print out just the ones that are in stock*/

public class Item {

    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
