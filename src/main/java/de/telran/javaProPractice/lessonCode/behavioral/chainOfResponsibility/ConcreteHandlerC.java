package de.telran.javaProPractice.lessonCode.behavioral.chainOfResponsibility;

public
class ConcreteHandlerC extends Handler {
    @Override
    public void handlerOperation(int value) {
        if (value == 3){
            System.out.println("ConcreteHandlerC : " + value);
        } else if (handler != null) {
            handler.handlerOperation(value);
        }
    }
}
