package lak.designPatterns.behavioral.visitorPattern.listOfGroceryItemsEmpl.before;

public class Client {

    /*let's say I want to apply a discount to every item in the groceryList. I want the discounts to be specific to each
    item, so it's going to be a bit different for each one. One option would be to add an applied discount method in
    both the Bread class and the Milk class, but I don't want to mix up the code for applying discounts with the
    grocery items themselves. That would be messy and difficult to maintain. So instead, I'm going to use the
    visitor pattern.*/

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        System.out.println("Total price of grocery list: "+groceryList.getPrice());
    }
}
