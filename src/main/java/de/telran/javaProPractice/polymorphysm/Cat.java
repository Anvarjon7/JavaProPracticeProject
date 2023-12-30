package de.telran.javaProPractice.polymorphysm;

public class Cat extends Animal{
    @Override
    void voice() {
        System.out.println("Meeeeowww");
    }
    void scratch(){
        System.out.println("Scratching");
    }
}
