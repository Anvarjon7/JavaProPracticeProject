package de.telran.javaProPractice.lessonCode.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        Handler handler3 = new ConcreteHandlerC();

        handler1.handler = handler2;
        handler2.handler = handler3;

        handler1.handlerOperation(1);
        handler1.handlerOperation(11);
    }
}
