package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaMessage messages = new BibliotecaMessage();
        Library library = new Library();

        Book book1 = new Book("ABC", "Lori", "2019", "1");
        library.addBook(book1);

        System.out.println(messages.welcomeUser());
        System.out.println("Select one:");
        System.out.println(messages.menuOption());

        Scanner userOptions = new Scanner(System.in);
        String userChoice = userOptions.nextLine();

        String listBooks = messages.menuOption();
        if(userChoice.equals(listBooks)){
            System.out.println(library.showAvailableBooks());
        } else {
            System.out.println("Please select a valid option.");
        }


    }
}
