package lak.designPatterns.behavioral.visitorPattern.listOfGroceryItemsEmpl.after;

public class Client {

    /* So this is how the visitor pattern is used to apply operations to elements in a composite without having
    to put those changes in the elements themselves. If I wanted to perform a different kind of operation on
    the grocery items, I could just create another implementation of the visitor interface.*/
    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        System.out.println("Total price of grocery list: "+groceryList.getPrice());
        groceryList.accept(new DiscountVisitor());
        System.out.println("New total of the grocery list "+ groceryList.getPrice());

    }
}
