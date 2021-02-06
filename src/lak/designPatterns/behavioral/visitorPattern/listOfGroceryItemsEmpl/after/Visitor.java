package lak.designPatterns.behavioral.visitorPattern.listOfGroceryItemsEmpl.after;

public interface Visitor {

    void visit(Bread bread);
    void visit(Milk milk);
    void visit(GroceryList groceryList);
}
