package de.telran.javaProPractice.lessonCode.behavioral.chainOfResponsibility;

public abstract class Handler {
    protected Handler handler = null;
    public abstract void handlerOperation(int value);
}
