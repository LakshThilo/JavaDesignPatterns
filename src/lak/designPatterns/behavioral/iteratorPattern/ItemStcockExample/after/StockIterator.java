package lak.designPatterns.behavioral.iteratorPattern.ItemStcockExample.after;

import java.util.Iterator;

/* I want to be able to iterate over my collection of items using the iterator pattern. So the first thing
I'm going to do now is I'm going to create a class to do the iteration. So I'm going to create
a new Java class and I'm going to call it stock iterator. Again, I'm going to make use of the JDK classes.
So I'm going to make this class implement iterator.*/

public class StockIterator implements Iterator {

    //And I need this because the iterator needs to know about the collection it's iterating over.
    private Inventory inventory;
    private int index;

    public StockIterator(Inventory inventory){
        this.inventory = inventory;
        index = 0;
    }

    @Override
    public boolean hasNext() {
       Item[] items = inventory.getItems();
       if(index < items.length){
           return  true;
       } else {
           return false;
       }
    }

    @Override
    public Item next() {

        Item[] items = inventory.getItems();
        if(hasNext()){
            Item item = items[index++];
            //Normally at this point, I would just return this item, but in my iterator, I only want to return items that are in stock and ignore the others.
            if(item.getQuantity() > 0 ){
                return item;
            } else {
                // this means quantity is 0, items is out of the stock
                return next();
            }
        //Now I just need to handle the scenario where it's the last item in the inventory. So if has next returns false,
        } else {
            return null;
        }
    }

    @Override
    public void remove() {

    }
}
