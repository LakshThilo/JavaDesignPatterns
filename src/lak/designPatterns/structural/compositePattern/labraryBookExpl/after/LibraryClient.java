package lak.designPatterns.structural.compositePattern.labraryBookExpl.after;

public class LibraryClient {

    public static void main(String[] args) {

        NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
        FictionBook fictionBookOne = new FictionBook("Hamlet", true);
        FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(nonfictionBook);
        bookCollection.addBook(fictionBookOne);
        bookCollection.addBook(fictionBookTwo);

        checkoutBook(nonfictionBook);
        checkoutBook(fictionBookOne);
        checkoutBook(bookCollection);

        returnBook(nonfictionBook);
        returnBook(fictionBookOne);
        returnBook(bookCollection);
    }




    private static void checkoutBook(Books book) {
        book.checkout();
    }

    private static void returnBook(Books book) {
        book.returnBook();
    }


}
