package de.telran.javaProPractice.lessonCode.creational.singleton;

public class Singleton {
    private String arg;
    private static volatile Singleton uniqueInstance;

    public Singleton(String arg) {
        this.arg = arg;
    }

    public static Singleton getUniqueInstance(String arg){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton(arg);
                }
            }
        }
        return uniqueInstance;
    }

    public String getArg() {
        return arg;
    }
}

class Main{
    public static void main(String[] args) {
        Singleton singleton = new Singleton("Argument example");
        System.out.println(singleton.getArg());
    }
}
