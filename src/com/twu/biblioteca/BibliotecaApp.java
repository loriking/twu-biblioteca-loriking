package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaMessage messages = new BibliotecaMessage();
        Book book1 = new Book("title", "author", "2019", true,"1");
        Book book2 = new Book("title2", "author", "2019", true, "2");
        Book book3 = new Book("title3", "author", "2019", true, "3");
        Book book4 = new Book("title4", "author", "2019", true, "4");

        ArrayList listOfBooks =  new ArrayList();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);

        Library library = new Library(listOfBooks);
        GetInput userInput = new GetInput();
        OptionsMenu options = new OptionsMenu();

        options.addOption("\t List of books");
        options.addOption("\t Quit");

        System.out.println(messages.welcomeUser()); 

        boolean userDidNotQuit = true;
        String userChoice;

        do {
            options.displayMenu();
            userChoice = userInput.getChoice();
            userDidNotQuit = !userChoice.equals("Quit");
            switch(userChoice){
                case "List of books":
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

