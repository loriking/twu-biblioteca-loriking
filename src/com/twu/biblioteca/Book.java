package com.twu.biblioteca;

public class Book {
    private final String title;
    private final String author;
    private final String year;
    private final String id;

    public Book(String title, String author, String year, String id) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.id = id;
    }

    @Override
    public String toString() {
        return  title + ", " + author + ", " + year + ", " + id ;

    }
}
