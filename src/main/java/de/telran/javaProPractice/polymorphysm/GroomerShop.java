package de.telran.javaProPractice.polymorphysm;

public class GroomerShop {
    public void cut(Animal animal){
        System.out.println("Cut,the animal said Thank yoouuuu - ");
        animal.voice();
    }
    void cutClaws(Cat cat){
        System.out.println("Cut claws,the animal said Thanks ");
        cat.scratch();
    }
}
