package de.telran.javaProPractice.lessonCode.lesson_12_02_24.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = new ConcreteProduct();
        creator.operation();
    }
}
