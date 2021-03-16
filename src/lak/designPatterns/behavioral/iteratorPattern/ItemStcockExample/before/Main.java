package lak.designPatterns.behavioral.iteratorPattern.ItemStcockExample.before;

import java.util.ArrayList;

/* In this example, I have an app that keeps track of stock for a store that sells stationary. I want to be able to
iterate over the items and print out just the ones that are in stock.*/

public class Main {

    public static void main(String[] args) {

        Item pens = new Item("pens",175);
        Item pencils = new Item("pencils",0); // out of stock
        Item paper = new Item("paper",500);

        // If i did - 1 way
        ArrayList<Item> items = new ArrayList<>();
        items.add(pens);
        items.add(pencils);
        items.add(paper);

        for (Item item: items) {
            if(item.getQuantity() == 0){
                continue;
            } else {
                System.out.println(item.getName());
            }
        }


        Stock stock =  new Stock();
        stock.addItems(pens);
        stock.addItems(pencils);
        stock.addItems(paper);

        System.out.println(stock.getItems());

    }

}
