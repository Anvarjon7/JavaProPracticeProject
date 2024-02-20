package de.telran.javaProPractice.lessonCode.lesson_12_02_24.factoryMethod;

public class ConcreteCreator extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
