package de.telran.javaProPractice.summary.lesson_23_02_2024.components;

import de.telran.javaProPractice.summary.lesson_23_02_2024.car.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel level -> " + car.getFuel());
    }

    public void checkStatus(){
        if (car.getEngine().isOn()){
            System.out.println("Car is on the way");
        }else {
            System.out.println("Car is on the garage");
        }
    }
}
