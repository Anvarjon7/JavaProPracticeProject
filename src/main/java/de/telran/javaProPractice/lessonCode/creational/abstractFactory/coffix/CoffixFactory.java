package de.telran.javaProPractice.lessonCode.creational.abstractFactory.coffix;

import de.telran.javaProPractice.lessonCode.creational.abstractFactory.factory.AbstractCoffee;
import de.telran.javaProPractice.lessonCode.creational.abstractFactory.factory.AbstractCup;
import de.telran.javaProPractice.lessonCode.creational.abstractFactory.factory.AbstractFactory;
import de.telran.javaProPractice.lessonCode.creational.abstractFactory.factory.AbstractLid;

public class CoffixFactory extends AbstractFactory {

    @Override
    public AbstractCoffee createAbstractCoffee(){
        return new CoffixCoffee();
    }
    @Override
    public AbstractLid createAbstractLid(){
        return new CoffixLid();
    }
    @Override
    public AbstractCup createAbstractCup(){
        return new CoffixCup();
    }

}
