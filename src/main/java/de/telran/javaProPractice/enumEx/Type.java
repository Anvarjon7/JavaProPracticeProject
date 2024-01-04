package de.telran.javaProPractice.enumEx;

import java.sql.SQLOutput;

public enum Type {
    PHANTASY,
    SCIENCE_FICTION,
    BELLETRE,
    ACTION
}
class Book{
    String author;
    Type booktype;
    String name;

    public Book(String author, Type type, String name) {
        this.author = author;
        booktype = type;
        this.name = name;
    }
}
class Program {
    public static void main(String[] args) {
        Book book = new Book("L.Tolstoy",Type.BELLETRE,"War and Peace");
        System.out.println(book.name +  " -> Genre: "  + book.booktype);

        switch (book.booktype){
            case ACTION -> System.out.println("action");
            case BELLETRE -> System.out.println("belletre");
            case PHANTASY -> System.out.println("phantasy");
            case SCIENCE_FICTION -> System.out.println("science");
        }
        Operation op = Operation.MULTIPLY;
        System.out.println(op.action(10,2));
    }
}
enum Operation{
    SUM{
        public int action(int x,int y){return x + y;}
    },
    SUB{
        public int action(int x,int y){return x - y;}
    },
    MULTIPLY{
        public int action(int x,int y){return x * y;}
    };
    public abstract int action(int x, int y);
}
