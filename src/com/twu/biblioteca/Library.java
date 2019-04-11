package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> allBooksInLibrary = new ArrayList<Book>();

    public Library(){}

    public Library(List<Book> books){
        this.allBooksInLibrary = books;
    }

    public String showBooks() {
        String displayAllBooks = "";
        for( Book book: allBooksInLibrary){
                displayAllBooks += "\n";
                displayAllBooks += book.toString();
        }
        return displayAllBooks;
    }

    public String showAvailableBooks() {
        String displayAvailableBooks = "";
        for( Book book: allBooksInLibrary){
            if (book.checkStatusOfBook()){
                displayAvailableBooks += "\n";
                displayAvailableBooks += book.toString();
            }
        }
        return displayAvailableBooks;
    }

    public void addBook(Book book) {
        allBooksInLibrary.add(book);
    }

    public String borrowBook(Book book){
        String getBook = "";
        if(book.checkStatusOfBook()){
            book.checkOutBook();
            getBook = BookLibraryConstants.AVAILABLE;
        } else {
            getBook = BookLibraryConstants.BORROWED;

        }

        return getBook;
    }


    public String returnBook(Book book) {
        boolean libraryContainsBook = allBooksInLibrary.contains(book);
        if (libraryContainsBook){
            book.returnBook();
            return BookLibraryConstants.THANKS;
        } else {
            return BookLibraryConstants.WRONG;
        }


    }
}
