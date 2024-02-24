package de.telran.javaProPractice.lessonCode.structural.lesson_19_02_24.adapter_object;

public class Adapter implements Target{

    private Adaptee adaptee;
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
