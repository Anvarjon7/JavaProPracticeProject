package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.flyweight;

public class Main {
    public static void main(String[] args) {
        int extrinsicState = 110;

        FlyWeight flyWeight = null;
        FlyWeightFactory factory = new FlyWeightFactory();

        flyWeight = factory.getFlyweight("11");
        flyWeight.operation(extrinsicState);

        flyWeight = factory.getFlyweight("133");
        flyWeight.operation(extrinsicState);

        flyWeight = new UnsharedConcreteFlyWeight();
        flyWeight.operation(extrinsicState);
    }
}
