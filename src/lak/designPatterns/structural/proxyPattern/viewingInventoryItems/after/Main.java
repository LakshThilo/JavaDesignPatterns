package lak.designPatterns.structural.proxyPattern.viewingInventoryItems.after;

public class Main {

    /*  Instead of creating a SuperstoreInventory object, I'm creating a SuperstoreInventoryProxy object. This means that
    I'm not creating the long list of items in the inventory until I call the PrintInventory method later on. This is how
    the proxy pattern can help you save memory and improve startup times in your application */
    public static void main(String[] args) {

        Inventory inventory = new SuperstoreInventoryProxy();
        Store store = new Store("Healthy Wholefoods", "Los Angeles", inventory);

        store.printName();
        store.printLocation();
        store.printInventory();
    }
}
