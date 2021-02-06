package lak.designPatterns.structural.compositePattern.labraryBookExpl.after;

import java.util.ArrayList;

public class BookCollection implements Books{

    private ArrayList<Books> books = new ArrayList<>();

    public void addBook(Books book) {
        books.add(book);
    }

    @Override
    public void checkout(){

        books.forEach(Books::checkout);
    }

    @Override
    public void returnBook(){
        books.forEach(Books::returnBook);

    }
}
