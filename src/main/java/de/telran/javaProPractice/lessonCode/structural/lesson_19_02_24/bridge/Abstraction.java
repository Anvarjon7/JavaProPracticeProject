package de.telran.javaProPractice.lessonCode.structural.lesson_19_02_24.bridge;

public abstract class Abstraction {

    private Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operation(){
        implementation.operationImpl();
    }
}
