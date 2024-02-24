package de.telran.javaProPractice.lessonCode.creational.abstractFactory.coffix;

import de.telran.javaProPractice.lessonCode.creational.abstractFactory.factory.AbstractCoffee;
import de.telran.javaProPractice.lessonCode.creational.abstractFactory.factory.AbstractCup;

public class CoffixCup extends AbstractCup {

    @Override
    public void interaction(AbstractCoffee abstractCoffee) {
        System.out.println(this + " interaction with " + abstractCoffee);
    }
}
