package lak.designPatterns.behavioral.visitorPattern.listOfGroceryItemsEmpl.after;
/* Now I've created the visitor objects. I need to finish off the visitor pattern by making sure each
elements can accept the visitor.*/
public interface Groceries {

    double getPrice();

    void accept(Visitor visitor);
}
