package de.telran.javaProPractice.lessonCode.behavioral.chainOfResponsibility;

public class ConcreteHandlerA extends Handler{

    @Override
    public void handlerOperation(int value) {
        if (value == 1){
            System.out.println("ConcreteHandlerA : " + value);
        } else if (handler != null) {
            handler.handlerOperation(value);
        }
    }
}
