package de.telran.javaProPractice.lessonCode.lesson_12_02_24.factoryMethod;

public abstract class Creator {

    private Product product;

    public abstract Product factoryMethod();

    public void operation(){
        this.product = factoryMethod();
    }
}
