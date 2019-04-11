package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book aBook;

    @Before
    public void setUp(){
        aBook = new Book("title", "author", "2019", true, "1");
    }

    @Test
    public void checkIfBookIsAvailable() {
        boolean expectedBookStatus = false;
        aBook.bookCheckedOut();
        assertEquals(expectedBookStatus, aBook.checkStatusOfBook());
    }

}
