package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaMessageTest {

    BibliotecaMessage message;

    @Before
    public void setUp(){
        message = new BibliotecaMessage();
    }

    @Test
    public void shouldReturnWelcomeMessage() {
        String message1 = "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore.";
        assertEquals(message1, message.welcomeUser());
    }

    @Test
    public void shouldReturnMenuOptionMessage() {
        String expectedMessage = "List of books";
        assertEquals(expectedMessage, message.menuOption());
    }


}

//do while loop in java