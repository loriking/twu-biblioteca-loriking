package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List <Book> availableBooks = new ArrayList<Book>();

    public String showAvailableBooks() {
        String displayBooks = "";
        for( Book book: availableBooks){
            displayBooks += book.toString();
        }
        return displayBooks;
    }

    public void addBook(Book book) {

        availableBooks.add(book);
    }
}
