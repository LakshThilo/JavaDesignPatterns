package lak.designPatterns.behavioral.iteratorPattern.ItemStcockExample.before;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Item> items;

    public Stock() {

        items = new ArrayList<>();
    }

    public void addItems(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems(){

        ArrayList<Item> newItems = new ArrayList<>();
        for (Item item: items) {
            if(item.getQuantity() != 0 ){
                newItems.add(item);
            } else {
                continue;
            }
        }
        items = newItems;
        return items;
    }

    public Item getItem(int itemNo) {

        return items.get(itemNo);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "items=" + items +
                '}';
    }
}
