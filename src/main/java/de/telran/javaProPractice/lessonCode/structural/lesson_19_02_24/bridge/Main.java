package de.telran.javaProPractice.lessonCode.structural.lesson_19_02_24.bridge;

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction1 = null;

        Abstraction abstraction2 = new RefinedAbstraction(new ConcreteImplementationA());
        abstraction2.operation();




    }
}
