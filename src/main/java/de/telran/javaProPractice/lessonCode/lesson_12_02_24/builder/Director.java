package de.telran.javaProPractice.lessonCode.lesson_12_02_24.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
        this.builder.buildPartD();
        this.builder.buildPartE();
    }
}
