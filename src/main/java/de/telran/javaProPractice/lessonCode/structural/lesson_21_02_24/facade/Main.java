package de.telran.javaProPractice.lessonCode.structural.lesson_21_02_24.facade;

public class Main {
    private SomeClass someClass = new SomeClass();

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operationAB();
        facade.operationBC();

//        Main main = new Main();
//        main.someClass.someClass2.doSome();       // bad practice




    }
}
class SomeClass {
    public SomeClass2 someClass2 = new SomeClass2();
}

class SomeClass2{
    public void doSome(){
        System.out.println("SomeClass2.doSome()");
    }
}