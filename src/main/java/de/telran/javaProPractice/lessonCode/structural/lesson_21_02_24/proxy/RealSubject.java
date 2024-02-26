package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.proxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("RealSubject.request()");
    }
}
