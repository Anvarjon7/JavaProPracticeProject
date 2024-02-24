package de.telran.javaProPractice.summary.lesson_23_02_2024.car;

import de.telran.javaProPractice.summary.lesson_23_02_2024.components.*;

public class Car {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private int seat;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    private double fuel = 0.0;

    public Car(CarType carType, Engine engine, Transmission transmission, int seat, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.seat = seat;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public int getSeat() {
        return seat;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
