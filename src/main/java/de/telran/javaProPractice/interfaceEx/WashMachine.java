package de.telran.javaProPractice.interfaceEx;

import java.rmi.Remote;

public class WashMachine implements RemoteRelation,IosApp {

    @Override
    public void switchOn() {
        System.out.println("WashMachine switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("WashMachine switched off");
    }

    @Override
    public void switchProgram() {
        System.out.println("WashMachine switched");
    }

    @Override
    public String authorization() {
        return null;
    }

    @Override
    public void install() {
        System.out.println("I can install only through WEB");
    }

    @Override
    public void verifyAppStore() {
        System.out.println("Two WashMachine Appstore always gives the go-ahead");
    }
}
