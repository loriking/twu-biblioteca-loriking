package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaMessage messages = new BibliotecaMessage();
        Book book1 = new Book("title", "author", "2019", "1");
        ArrayList listOfBooks =  new ArrayList();
        listOfBooks.add(book1);
        Library library = new Library(listOfBooks);
        GetInput userInput = new GetInput();
        OptionsMenu options = new OptionsMenu();

        options.addOption("List of books");

        System.out.println(messages.welcomeUser()); // Is this a necessary class? Isn't a class overkill?

        String listBooks = messages.menuOption();

        boolean userDidNotQuit = true;
        String userChoice;

        do {
            options.displayMenu();
            userChoice = userInput.getChoice();
            userDidNotQuit = !userChoice.equals("Quit");
            switch(userChoice){
                case "List":
                    System.out.println(library.showAvailableBooks());
                    break;
                case "Quit":
                    System.out.println("Good-bye");
                    break;
                default:
                    System.out.println("Please select a valid option.");
            }
        } while(userDidNotQuit);


    }

}

