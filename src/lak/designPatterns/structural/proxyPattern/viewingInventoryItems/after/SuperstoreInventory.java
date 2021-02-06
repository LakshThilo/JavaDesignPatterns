package lak.designPatterns.structural.proxyPattern.viewingInventoryItems.after;

import java.util.ArrayList;

public class SuperstoreInventory implements Inventory {

    ArrayList<Item> inventory = new ArrayList<>();

    public SuperstoreInventory(){

        /* In a commercial app, this information might be stored in a database and instead of adding to and retrieving
        the items from an array list, there might be some expensive calls to connect to a database here. To keep this
        exercise simple and so that no knowledge of databases is required to complete it, the items are just stored in
        an array list.*/
        inventory.add(new Item("Bread", 1, 500));
        inventory.add(new Item("Milk", 0.5, 400));
        inventory.add(new Item("Eggs", 0.7, 300));
        inventory.add(new Item("Coffee", 1, 100));
        inventory.add(new Item("Ham", 4, 300));
        inventory.add(new Item("Bun", 2, 400));
        inventory.add(new Item("Orange", 1, 400));
        inventory.add(new Item("Cereal", 0.3, 200));
        inventory.add(new Item("Butter", 1, 500));
        inventory.add(new Item("Pasta", 0.2, 600));
        inventory.add(new Item("Apple", 0.2, 200));
        inventory.add(new Item("Bananas", 0.1, 200));
        inventory.add(new Item("Onions", 0.1, 500));
    }

    @Override
    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
