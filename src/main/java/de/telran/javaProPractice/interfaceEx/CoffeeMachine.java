package de.telran.javaProPractice.interfaceEx;

public class CoffeeMachine implements RemoteRelation, AndroidApp {
    @Override
    public void switchOn() {
        System.out.println("Coffee Machine switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Coffee Machine switched off");
    }

    @Override
    public void switchProgram() {
        System.out.println("Coffee machine switched");
    }

    @Override
    public String authorization() {
        return null;
    }

    @Override
    public void install() {
        System.out.println("install Android " + FREE_PAY);
    }
}
