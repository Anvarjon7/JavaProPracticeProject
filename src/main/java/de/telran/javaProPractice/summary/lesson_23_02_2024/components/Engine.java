package de.telran.javaProPractice.summary.lesson_23_02_2024.components;

public class Engine {
    private double volume;
    private double mileage;
    private boolean isOn;
    private boolean isElectric;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void onEngine() {
        isOn = true;
    }

    public void offEngine(){
        isOn = false;
    }

    public void goEngine(double mileage){
        if (isOn){
            this.mileage += mileage;
        }else {
            System.out.println("The Engine is off!!!");
        }
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isOn() {
        return isOn;
    }
}
