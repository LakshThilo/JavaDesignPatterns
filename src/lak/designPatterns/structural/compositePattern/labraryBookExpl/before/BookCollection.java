package lak.designPatterns.structural.compositePattern.labraryBookExpl.before;

import java.util.ArrayList;

public class BookCollection {

    private ArrayList<NonfictionBook> nonfictionBooks = new ArrayList<>();
    private ArrayList<FictionBook> fictionBooks = new ArrayList<>();

    public void addFictionBook(FictionBook fictionBook) {
        fictionBooks.add(fictionBook);
    }

    public void addNonFictionBook(NonfictionBook nonfictionBook) {
        nonfictionBooks.add(nonfictionBook);
    }

    public void checkout(){
        nonfictionBooks.forEach(NonfictionBook::checkout);
        fictionBooks.forEach(FictionBook::checkout);
    }

    public void returnBook(){
        nonfictionBooks.forEach(NonfictionBook::returnBook);
        fictionBooks.forEach(FictionBook::returnBook);
    }
}
