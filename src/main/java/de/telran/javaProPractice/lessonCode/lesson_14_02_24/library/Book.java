package de.telran.javaProPractice.lessonCode.lesson_14_02_24.library;

public class Book {
    private String title;
    private String author;
    private int year;
    private Genre genre;
    private boolean isAvailable;

    public Book(String title, String author, int year, Genre genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
