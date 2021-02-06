package lak.designPatterns.behavioral.iteratorPattern.ItemStcockExample.after;

public class Inventory implements Iterable {

    private Item[] items;

    // I want to be able to pass in as many or few items as I want or an array. So I'm going to use the Var feature in Java
    public Inventory(Item... items){
        this.items = items;
    }

    public Item[] getItems(){

        return items;
    }

    @Override
    public StockIterator iterator() {

        return new StockIterator(this);
    }
}
