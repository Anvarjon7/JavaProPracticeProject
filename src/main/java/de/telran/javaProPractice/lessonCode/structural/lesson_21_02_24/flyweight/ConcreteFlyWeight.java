package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.flyweight;

public class ConcreteFlyWeight implements FlyWeight{

    private int instrinsicState;
    @Override
    public void operation(int extrinsicState) {
        this.instrinsicState = extrinsicState;
    }
}
