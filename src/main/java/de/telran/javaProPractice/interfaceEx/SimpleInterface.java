package de.telran.javaProPractice.interfaceEx;

public class SimpleInterface {
    public static void main(String[] args) {
        TV tv = new TV();
        WashMachine washMachine = new WashMachine();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        RemoteRelation relation =  new TV();

        AndroidApp app = new CoffeeMachine();
        app.install();

        RemoteRelation remoteRelation = new CoffeeMachine();

        IosApp iosApp = new WashMachine();

        myMethod(new CoffeeMachine(),new WashMachine());

    }

    static void myMethod(RemoteRelation relation, IosApp iosApp){
        relation.switchProgram();
        System.out.println(iosApp.sum(3,6,3));
    }
}
