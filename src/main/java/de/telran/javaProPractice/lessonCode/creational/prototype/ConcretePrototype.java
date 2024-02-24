package de.telran.javaProPractice.lessonCode.creational.prototype;

public class ConcretePrototype extends Prototype{

    public ConcretePrototype(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(id);
    }
}
