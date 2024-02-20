package de.telran.javaProPractice.lessonCode.lesson_14_02_24.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;


    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }


    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library -> " + book.getTitle());
    }

    public void removeBook(Book book){
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("The Book removed " + book.getTitle());
        }else {
            System.out.println("There is no such book in our library!!!");
        }
    }

    public void registerUser(User user){
        if (users.contains(user)){
            System.out.println("A user with the same ID already exists!");
        }else {
            users.add(user);
        }
    }

    public List<Book> findBooksByTitle(String title){
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books){
            if (book.getTitle().equals(title)){
                foundBooks.add(book);
                System.out.println("Yes we have such a Book " + title);
            }else {
                System.out.println("We don't have such a Book!");
            }
        }
        return foundBooks;
    }

    public void removeUser(User user){
        if (users.contains(user)){
            users.remove(user);
            System.out.println("User removed " + user.getName());
        }else {
            System.out.println("There is no such user!!!");
        }
    }


}
