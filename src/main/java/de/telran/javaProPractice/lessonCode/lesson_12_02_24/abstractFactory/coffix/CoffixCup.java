package de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.coffix;

import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.factory.AbstractCoffee;
import de.telran.javaProPractice.lessonCode.lesson_12_02_24.abstractFactory.factory.AbstractCup;

public class CoffixCup extends AbstractCup{

    @Override
    public void interaction(AbstractCoffee abstractCoffee) {
        System.out.println(this + " interaction with " + abstractCoffee);
    }
}
