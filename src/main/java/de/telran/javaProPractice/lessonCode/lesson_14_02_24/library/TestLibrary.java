package de.telran.javaProPractice.lessonCode.lesson_14_02_24.library;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Cracking coding interview","Gayle Laakmann MCDowell",2005,Genre.SCIENCE,true);
        library.addBook(book);

        User user = new User("John Smith",1);
        library.registerUser(user);

        library.findBooksByTitle("Cracking coding interview");

        library.removeUser(user);

    }
}
