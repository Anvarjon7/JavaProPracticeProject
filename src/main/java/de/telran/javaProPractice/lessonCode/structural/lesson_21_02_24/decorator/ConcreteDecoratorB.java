package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.decorator;

public class ConcreteDecoratorB extends Decorator{

    public void someMethod(){
        System.out.println("someMethod");
    }

    @Override
    public void operation() {
        super.operation();
        someMethod();
    }
}
