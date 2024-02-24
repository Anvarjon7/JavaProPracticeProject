package de.telran.javaProPractice.lessonCode.creational.builder;

public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public abstract void buildPartD();
    public abstract void buildPartE();

    public abstract Product getResult();
}
