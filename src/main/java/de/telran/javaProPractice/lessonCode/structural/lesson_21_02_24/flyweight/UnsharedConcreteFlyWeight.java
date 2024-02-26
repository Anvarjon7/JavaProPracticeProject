package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.flyweight;

public class UnsharedConcreteFlyWeight implements FlyWeight{

    private int state;
    @Override
    public void operation(int extrinsicState) {
        this.state = extrinsicState;
    }
}
