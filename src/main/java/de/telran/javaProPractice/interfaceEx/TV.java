package de.telran.javaProPractice.interfaceEx;

public class TV implements RemoteRelation {

    @Override
    public void switchOn() {
        System.out.println("TV switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("TV switched off");
    }

    @Override
    public void switchProgram() {
        System.out.println("TV switched channel");
    }
    public void install() {
        System.out.println("Я могу инсталлироваться для обслуживания ТВ");
    }

    @Override
    public String authorization() {
        // взять юзера из Андроид ТВ
        return "Я пользователь Вася, взять с Андроид ТВ";
    }
}
