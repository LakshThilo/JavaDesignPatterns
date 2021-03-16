package lak.designPatterns.behavioral.visitorPattern;

public class Visitor_Pattern {

 /** Say you have a tree of objects, and you want to perform an operation on all the elements of it. */

 /*  The visitor pattern allows you to do this without making changes to the elements themselves.
     Instead,a separate visitor object is passed to each object to perform the operation.*/

/*   As a real world analogy, imagine someone drives a car to a mechanic's. The mechanics temporarily
     take over the car to fix some things, and then the car is driven away again. The mechanics might do
     different kinds of fixes depending on the problem. There also might be different kinds of vehicles,
     such as trucks and buses and so on. The different fixes might be similar for each different type of
     vehicle, but also slightly different.*/

/*   Let's see what the visitor pattern looks like in a Java program. So let's say you have an interface
     with some concrete implementations of it, and let's say you want to apply some operation to each of
     the  concrete implementations. The operation will be similar but slightly different for each concrete element.
        - One option would be to put a method for the operation inside each element, but that gives you a structure that's
          difficult to understand and make changes to.

        - The other option is to use the visitor pattern. In this version, you create an interface that defines a visit
          method for each of the concrete implementations. Then you have concrete implementations of the visitor interface.

    The visitors have a method called visit, and the concrete elements have a method called accept, which accepts a visitor.
    In particular, the visitor pattern is useful if you also have a composite, or a list of the other elements.
    For example, say you have a third implementation of the element interface, which contains a list of other types of elements. T
    his is known as the object structure. The visitor pattern allows you to apply operations to each element in the list without
    worrying about type safety, because each will have its own separate visit method defined that performs the operation differently
    for each type.

    It's worth noting that the visitor pattern is best used when the elements are not likely to change. If you were
    to start adding more elements to the concrete implementations, you would have to go back and update the visitor
    interface as well as every concrete implementation of it. This inflexibility is one of the downsides of using the
    visitor pattern. It's also fairly rare to see this pattern used, partly because it's so complex and partly because
    it's a very specific use case. But if you do have this use case, but you want to define new operations without making
    changes to the existing object structure, the visitor pattern can offer a neat and elegant solution. It makes good
    use of the open-closed principle, meaning that the classes are open for extension, but closed for modification.*/
}
