package de.telran.javaProPractice.lessonCode.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = null;
        Prototype clone = null;

        prototype = new ConcretePrototype(1000);
        clone = prototype.clone();
        System.out.println(clone.id);

        prototype = new ConcretePrototype(200000);
        clone = prototype.clone();
        System.out.println(clone.id);
    }
}
