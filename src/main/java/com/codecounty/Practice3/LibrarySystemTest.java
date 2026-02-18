package com.codecounty.Practice3;

public class LibrarySystemTest {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new Book("101", "Java Programming"));
        myLibrary.addBook(new Book("102", "Data Structure"));

        try {
            System.out.println("Invalid Count: " + myLibrary.getTotalBookCount());

            myLibrary.borrowBook("101");

            myLibrary.borrowBook("101");

            myLibrary.borrowBook("999");

        } catch (BookNotFoundException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
