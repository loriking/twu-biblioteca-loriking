package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaMessageTest {

    @Test
    public void shouldReturnWelcomeMessage(){
        BibliotecaMessage message =  new BibliotecaMessage();
        String message1 = "Welcome to Biblioteca. Your one-stop shop for great book titles in Bangalore.";
        assertEquals(message1, message.welcomeUser());

    }

    @Test
    public void shouldReturnListOfBooks(){

    }
}
