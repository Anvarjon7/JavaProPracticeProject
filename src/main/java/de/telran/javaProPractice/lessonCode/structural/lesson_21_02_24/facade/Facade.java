package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.facade;

public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void operationAB(){
        subSystemA.operationA();
        subSystemB.operationB();
    }

    public void operationBC(){
        subSystemB.operationB();
        subSystemC.operationC();
    }
}
