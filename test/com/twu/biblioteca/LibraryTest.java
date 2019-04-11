package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void setUp(){
        library = new Library();
        book1 = new Book("Jo and her friends", "Jo", "2019", true,"1" );
        book2 = new Book("Mo and his friends", "Mo", "2020", true,"2" );
        book3 = new Book("Po and his friends", "Po", "2020", true,"3" );
        book4 = new Book("To and his friends", "To", "2020", true,"4" );
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }


    @Test
    public void shouldReturnEmptyStringWhenThereIsNoBookAvailable() {
        Library emptyLibrary = new Library();
        assertEquals("", emptyLibrary.showAvailableBooks());

    }
    @Test
    public void shouldDisplayAllBooks() {
        String expected = "\nJo and her friends\t\t\tJo\t\t\t2019\t\t\t1\nMo and his friends\t\t\tMo\t\t\t2020\t\t\t2" +
                "\nPo and his friends\t\t\tPo\t\t\t2020\t\t\t3";
        assertEquals(expected, library.showBooks());
    }


    @Test
    public void shouldDisplayABookWhenABookIsAvailable() {
        book3.bookCheckedOut();
        String expected = "\nJo and her friends\t\t\tJo\t\t\t2019\t\t\t1\nMo and his friends\t\t\tMo\t\t\t2020\t\t\t2";
        assertEquals(expected, library.showAvailableBooks());
    }

    @Test
    public void shouldNotifyIfBookInLibrary() {
        library.borrowBook(book2);
        String expected = "\nJo and her friends\t\t\tJo\t\t\t2019\t\t\t1\nPo and his friends\t\t\tPo\t\t\t2020\t\t\t3";
        assertEquals(expected, library.showAvailableBooks());
    }

    @Test
    public void shouldNotifyIfBookNotInLibrary(){
        library.borrowBook(book2);
        String expected = BookLibraryConstants.BORROWED;
        String actual = library.borrowBook(book2);
        assertEquals(expected, actual );
    }

    @Test
    public void shouldNotifyCustomerOfSucessfulReturn(){
        library.borrowBook(book2);
        String actual = library.returnBook(book2);
        String expected = BookLibraryConstants.THANKS;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTellCustomerBookIsFromDifferentLibrary(){
        String expected = BookLibraryConstants.WRONG;
        String actual = library.returnBook(book4);
        assertEquals(expected, actual);

    }




}
