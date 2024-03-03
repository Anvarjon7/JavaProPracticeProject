package de.telran.javaProPractice.lessonCode.behavioral.iterator;

public interface Iterator<E>{
    boolean hasNext();
    E next();
    void reset();
}
