package de.telran.javaProPractice.lessonCode.creational.factoryMethod;

public abstract class Creator {

    private Product product;

    public abstract Product factoryMethod();

    public void operation(){
        this.product = factoryMethod();
    }
}
