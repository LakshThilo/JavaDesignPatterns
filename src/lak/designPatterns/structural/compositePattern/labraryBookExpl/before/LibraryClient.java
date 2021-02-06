package lak.designPatterns.structural.compositePattern.labraryBookExpl.before;

public class LibraryClient {

    /*In this example,  need to refactor an app for checking out library books. This has a similar structure to the expenses payments */
    public static void main(String[] args) {

        NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
        FictionBook fictionBookOne = new FictionBook("Hamlet", true);
        FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.addNonFictionBook(nonfictionBook);
        bookCollection.addFictionBook(fictionBookOne);
        bookCollection.addFictionBook(fictionBookTwo);

        checkoutNonFictionBook(nonfictionBook);
        checkoutFictionBook(fictionBookOne);
        checkoutBookCollection(bookCollection);

        returnNonFictionBook(nonfictionBook);
        returnFictionBook(fictionBookOne);
        returnBookCollection(bookCollection);
    }

    private static void checkoutNonFictionBook(NonfictionBook nonfictionBook) {
        nonfictionBook.checkout();
    }

    private static void checkoutBookCollection(BookCollection bookCollection) {
        bookCollection.checkout();
    }

    private static void checkoutFictionBook(FictionBook fictionBookOne) {
        fictionBookOne.checkout();
    }



    private static void returnBookCollection(BookCollection bookCollection) {
        bookCollection.returnBook();
    }

    private static void returnFictionBook(FictionBook fictionBookOne) {
        fictionBookOne.returnBook();
    }

    private static void returnNonFictionBook(NonfictionBook nonfictionBook) {
        nonfictionBook.returnBook();
    }
}
