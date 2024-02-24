package de.telran.javaProPractice.lessonCode.structural.lesson_19_02_24.adapter_class;

public class Adapter extends Adaptee implements Target {


    @Override
    public void request() {
        specificRequest();
    }
}
