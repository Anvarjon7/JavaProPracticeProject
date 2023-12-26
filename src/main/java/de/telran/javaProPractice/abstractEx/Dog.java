package de.telran.javaProPractice.abstractEx;

public class Dog extends Animal{
    String name;
    String breed;

    @Override
    protected void voice() {
        System.out.println("Gaawww");
    }

    @Override
    protected void run() {
        System.out.println("Run's");
    }
}
