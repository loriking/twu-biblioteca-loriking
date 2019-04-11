package com.twu.biblioteca;

public class Book {
    private final String title;
    private final String author;
    private final String year;
    private boolean available;
    private final String id;


    public Book(String title, String author, String year, boolean available, String id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
        this.id = id;
    }

    public boolean checkStatusOfBook(){
        return this.available;
    }

    public void checkOutBook(){
        this.available = false;
        System.out.println("Thank you! Enjoy the book.");
    }

    public void returnBook(){
        this.available = true;
        System.out.println("Thank you for returning the book.");
    }

    @Override
    public String toString() {
        String bookFormat = title + "\t\t\t" + author + "\t\t\t" + year + "\t\t\t" + id ;
        return bookFormat;

    }
}
