package de.telran.javaProPractice.lessonCode.lesson_12_02_24;

import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.coffix.CoffixFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new CoffixFactory());
        client.construct();
    }
}
