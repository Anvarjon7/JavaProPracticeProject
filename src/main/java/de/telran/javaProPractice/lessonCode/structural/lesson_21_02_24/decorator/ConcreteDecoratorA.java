package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.decorator;

public class ConcreteDecoratorA extends Decorator{
    private String someState = "someState";

    @Override
    public void operation() {
        super.operation();
        System.out.println(someState);
    }
}
