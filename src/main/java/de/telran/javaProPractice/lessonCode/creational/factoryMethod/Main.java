package de.telran.javaProPractice.lessonCode.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = new ConcreteProduct();
        creator.operation();
    }
}
