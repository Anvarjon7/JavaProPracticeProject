package de.telran.javaProPractice.lessonCode.behavioral.chainOfResponsibility;

public class ConcreteHandlerB extends Handler{
    @Override
    public void handlerOperation(int value) {
        if (value == 2){
            System.out.println("ConcreteHandlerB : " + value);
        } else if (handler != null) {
            handler.handlerOperation(value);
        }
    }
}
