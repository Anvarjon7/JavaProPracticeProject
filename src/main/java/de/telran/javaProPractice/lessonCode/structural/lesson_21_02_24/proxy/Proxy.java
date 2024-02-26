package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.proxy;

public class Proxy implements Subject{
    private RealSubject subject;
    @Override
    public void request() {
        if (subject == null){
            subject = new RealSubject();
        }
        subject.request();
        //...............
    }
}
