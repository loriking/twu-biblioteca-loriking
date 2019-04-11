package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        library = new Library();
        book1 = new Book("Jo and her friends", "Jo", "2019", true,"1" );
        book2 = new Book("Mo and his friends", "Mo", "2020", true,"2" );
        book3 = new Book("Po and his friends", "Po", "2020", true,"3" );
    }


    @Test
    public void shouldReturnEmptyStringWhenThereIsNoBookAvailable() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals("", library.showAvailableBooks());
    }

    @Test
    public void shouldDisplayAllBooks() {
        String expected = "\nJo and her friends\t\t\tJo\t\t\t2019\t\t\t1\nMo and his friends\t\t\tMo\t\t\t2020\t\t\t2" +
                "\nPo and his friends\t\t\tPo\t\t\t2020\t\t\t3";
        assertEquals(expected, library.showBooks());
    }

    @Test
    public void shouldDisplayABookWhenABookIsAvailable() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        book3.checkOutBook();
        String expected = "\nJo and her friends\t\t\tJo\t\t\t2019\t\t\t1\nMo and his friends\t\t\tMo\t\t\t2020\t\t\t2";
        assertEquals(expected, library.showAvailableBooks());
    }

    @Test
    public void shouldNotifyIfBookInLibrary() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook(book2);
        String expected = "\nJo and her friends\t\t\tJo\t\t\t2019\t\t\t1\nPo and his friends\t\t\tPo\t\t\t2020\t\t\t3";
        assertEquals(expected, library.showAvailableBooks());
    }

    @Test
    public void shouldNotifyIfBookNotInLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook(book2);
        String expected = BookLibraryConstants.BORROWED;
        String actual = library.borrowBook(book2);
        assertEquals(expected, actual );
    }

    @Test
    public void shouldNotifyCustomerOfSucessfulReturn(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook(book2);
        String actual = library.returnBook(book2);
        String expected = BookLibraryConstants.THANKS;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTellCustomerBookIsFromDifferentLibrary(){
        String expected = BookLibraryConstants.WRONG;
        String actual = library.returnBook(book2);
        assertEquals(expected, actual);

    }




}
