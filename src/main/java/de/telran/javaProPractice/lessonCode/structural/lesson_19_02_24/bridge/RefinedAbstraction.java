package de.telran.javaProPractice.lessonCode.structural.lesson_19_02_24.bridge;

public class RefinedAbstraction extends Abstraction{


    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void operation() {
        super.operation();
    }
}
