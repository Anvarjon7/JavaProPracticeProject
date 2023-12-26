package de.telran.javaProPractice.interfaceEx;

public interface App {
    void install();

    default String authorization(){
        return "I'm user NonName";
    }
}
