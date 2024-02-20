package de.telran.javaProPractice.lessonCode.lesson_12_02_24;

import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.factory.AbstractCoffee;
import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.factory.AbstractCup;
import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.factory.AbstractFactory;
import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.factory.AbstractLid;

public class Client {

    private AbstractCoffee coffee;
    private AbstractCup cup;
    private AbstractLid lid;

    public Client(AbstractFactory abstractFactory) {
        this.coffee = abstractFactory.createAbstractCoffee();
        this.cup = abstractFactory.createAbstractCup();
        this.lid = abstractFactory.createAbstractLid();
    }

    public void construct(){
        this.cup.interaction(coffee);
    }
}
