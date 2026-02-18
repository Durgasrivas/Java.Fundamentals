package com.codecounty.Practice3;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book>bookMap=new HashMap<>();
    private int totalBookCount=0;

    public void addBook(Book book){
        bookMap.put(book.getIsbn(), book);
        if(book.isAvailable()){
            totalBookCount++;
        }
    }
    public void borrowBook(String isbn) throws BookNotFoundException{
        if(!bookMap.containsKey(isbn)){
            throw new BookNotFoundException("Error: Book with ISBN "+isbn+" not found");
        }
        Book book=bookMap.get(isbn);
        if(!book.isAvailable()){
            throw new IllegalStateException("Error: The book '"+book.getTitle()+"' is already borrowed.");
        }
        book.setAvailable(false);
        totalBookCount++;

        System.out.println("Success! You boorrowed: "+book.getTitle());
        System.out.println("Avaliable books remaining: "+totalBookCount);
    }
    public int getTotalBookCount(){return totalBookCount;}
}
