package de.telran.javaProPractice.abstractEx;

public class Rino extends Animal {
    String type;

    int weight;

    @Override
    protected void voice() {
        System.out.println("yells");
    }

    @Override
    protected void run() {
        System.out.println("Tramples loudly");
    }
}
