package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void shouldReturnEmptyStringWhenThereIsNoBookAvailable() {
        Library library = new Library();
        assertEquals("", library.showAvailableBooks());
    }

    @Test
    public void shouldDisplayABookWhenABookIsAvailable() {
        Library library = new Library();
        Book book = new Book("Jo and her friends", "Jo", "2019", "1" );
        library.addBook(book);
        assertEquals("Jo and her friends, Jo, 2019, 1" , library.showAvailableBooks());

    }
}
