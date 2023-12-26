package de.telran.javaProPractice.abstractEx;

public class Cat extends Animal {
    String name;
    String breed;


    @Override
    protected void voice() {
        System.out.println("Meeoooww");
    }

    @Override
    protected void run() {
        System.out.println("Run's fast");
    }
}
