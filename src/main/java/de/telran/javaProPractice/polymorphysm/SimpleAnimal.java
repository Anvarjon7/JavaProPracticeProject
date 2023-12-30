package de.telran.javaProPractice.polymorphysm;

public class SimpleAnimal {
    public static void main(String[] args) {
        GroomerShop groomerShop = new GroomerShop();
        Animal animal = new Animal();
        animal.voice();
        groomerShop.cut(animal);

        animal = new Cat();
        animal.voice();
        groomerShop.cut(animal);

        animal = new Dog();
        animal.voice();
        groomerShop.cut(animal);


    }
}
