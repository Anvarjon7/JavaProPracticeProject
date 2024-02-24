package de.telran.javaProPractice.lessonCode.creational.abstractFactory;

import de.telran.javaProPractice.lessonCode.creational.abstractFactory.coffix.CoffixFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new CoffixFactory());
        client.construct();
    }
}
