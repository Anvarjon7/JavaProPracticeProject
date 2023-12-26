package de.telran.javaProPractice.abstractEx;

public class SimpleAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        cat.run();
        cat.rest();

        Dog dog = new Dog();
        dog.run();
        dog.rest();
        dog.voice();

        Rino rino = new Rino();
        rino.rest();
        rino.run();
        rino.voice();

    }
}
