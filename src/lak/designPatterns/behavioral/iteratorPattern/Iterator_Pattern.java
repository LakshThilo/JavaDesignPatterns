package lak.designPatterns.behavioral.iteratorPattern;

public class Iterator_Pattern {

    /*
        If you've ever used Collections, which you probably have, it's likely you've used the Iterator Pattern extensively.
        This for-each loop is commonly used in Java to iterate over a collection of objects.
        And under the hood is actually using The Iterator Pattern.
    *
        One of the benefits of the Iterator Pattern that's shown in this example, is that it doesn't matter what type of
        collection the Sentence object is. It could be an ArrayList or a HashSet, or a LinkedBlockingQueue, or whatever.
        As long as there's something that implements the Collection Interface. The for-each loop, works the same on all of them.
        And it's irrelevant what the underlying structure looks like.

    *   So say I have a list, or collection, like this list of countries here for example. I might want to traverse this list,
        and access the items in it in some app that I'm making. And there might be different ways I want to traverse it.
        For example, I might want to cut out all of the countries in Africa, or all of the countries with a certain population
        size, and so on.
                    I could add a load of methods to the List class to sort through the list in different ways. But I don't want
        to just add them all in there, because it will turn into one big class with loads of stuff in. I also don't know yet
        which kinds of iteration I need, so I might end up including loads of unused code. So this is where the Iterator comes in instead.

        The Iterator, is a separate object that takes all of the responsibility for moving along the list, and accessing
        the objects inside it. It's responsible for keeping track of which elements have already been traversed.

        So to summarize, the Iterator Pattern provides a way to access the items in a list or collection of some type,
        without exposing the underlying structure. In Java, there are interfaces called Iterable And Iterator, which do
        a lot of the heavy lifting for you, if you want to use this pattern. But it's also important to know how it
        works because you might want to write your own custom iterators.
    * */
}
