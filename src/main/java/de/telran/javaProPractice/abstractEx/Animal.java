package de.telran.javaProPractice.abstractEx;

public abstract class Animal {
    protected String name;
    protected abstract void voice();
    protected abstract void run();
    protected void rest(){
        System.out.println("They are sleeping!");
    }
}
