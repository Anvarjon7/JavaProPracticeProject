package de.telran.javaProPractice.lessonCode.creational.prototype;

public abstract class Prototype {

    protected int id;

    public Prototype(int id) {
        this.id = id;
    }
    public abstract Prototype clone();
}
