package lak.designPatterns.behavioral.templateMethodPattern;

public class Template_Method_Pattern {

/**    The template method pattern is all about defining the common steps in an algorithm and a superclass and redefining some of those steps in a subclass.*/

/*     This is actually one of the most commonly used design patterns.
        As a real life example, imagine there's a recipe for making lasagna. The recipe defines a set of steps which you follow to cook the lasagna,
        but there might be alternative versions with different fillings.

        For example, there might be a beef mince lasagna recipe, a vegetable lasagna recipe, or a lentil lasagna recipe, and they might also have
        different methods for making things like the white sauce. Some of the steps might be the same for every lasagna, for example, constructing
        the lasagna and cooking it in the oven. In code, you would define the steps for making a lasagna in an abstract class, for example, with
        methods for making the filling, making the white sauce, and baking the lasagna.

        The instructions for baking the lasagna will be the same for all of them, so that would go in the abstract class,
        but the instructions for making the filling and the white sauce could be different for each, so these steps are
        defined in here but implemented differently in each of the subclasses.

        This pattern is fairly common in frameworks, but there are some reasons why not everyone is a fan of the template method pattern.
        It can be difficult to communicate to users of the framework what the intent is. If you came across a use of the template method pattern,
        it might not be immediately obvious which parts are meant to be changed. It can also be quite difficult to follow the flow of the program,
        as the functionality can jump between different classes. However, it is a useful pattern to know, as it is commonly used, and it can be
        useful when you want to implement the common parts of an algorithm once and leave the varying parts to subclasses.
        In particular, if you find that you have classes which duplicate the same code, you might be able to refactor some of those steps out into
        an abstract class.*/
}
