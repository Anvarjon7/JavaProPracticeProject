package de.telran.javaProPractice.lessonCode.lesson_14_02_24.library;

import java.io.StringReader;
import java.util.ArrayList;

public class User {
    private String name;
    private int id;

    private ArrayList<Book> books;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void borrowBook(Book book){
        if (books == null){
            books = new ArrayList<>();
        }

        if (book.isAvailable()){
            books.add(book);
            book.setAvailable(false);

            System.out.println("The Book added " + book.getTitle());
        }else {
            System.out.println(book.getTitle() + "unavailable!!!");
        }
    }

    public void returnBook(Book book){
        if (books.contains(book)){
            books.remove(book);
            book.setAvailable(true);

            System.out.println(this.name + " returned the book " + book.getTitle());
        }else {
            System.out.println(this.name + " didn't take this book " + book.getTitle());
        }
    }

    public String getName(){
        return name;
    }
}
