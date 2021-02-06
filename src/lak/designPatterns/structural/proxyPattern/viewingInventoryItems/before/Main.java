package lak.designPatterns.structural.proxyPattern.viewingInventoryItems.before;

import lak.designPatterns.structural.proxyPattern.viewingInventoryItems.after.SuperstoreInventoryProxy;

public class Main {

    /* If I run the app, it prints out the name of the store, Healthy Whole Foods, then the location, Los Angeles,
    and then the list of items in the inventory, so bread, milk, eggs, coffee, and so on. The problem here is that
    the expensive operation of creating lots of items and adding them to the inventory is happening in the first
    line where we create an inventory object, but we're not using that list until the last line when we call store.printInventory,
    and even if we never called that, the list will still be created when we start up the app. */
    public static void main(String[] args) {

        Inventory inventory = new SuperstoreInventory();
        Store store = new Store("Healthy Wholefoods", "Los Angeles", inventory);

        store.printName();
        store.printLocation();
        store.printInventory();
    }
}
