package de.telran.javaProPractice.staticEx;

public class Car {
    String model;
    private int year;
    static int count;
    public static final int COUNT_EARS = 2;
    public Car(String model) {
        this.model = model;
        count++;
    }

    public void setYear(int year) {
        this.year = year;
    }
    static void inc(){
        count++;
    }
}
