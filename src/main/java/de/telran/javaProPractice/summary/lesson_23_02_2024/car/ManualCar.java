package de.telran.javaProPractice.summary.lesson_23_02_2024.car;

import de.telran.javaProPractice.summary.lesson_23_02_2024.components.Engine;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.GPSNavigator;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.Transmission;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.TripComputer;

public class ManualCar {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private int seat;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public ManualCar(CarType carType, Engine engine, Transmission transmission, int seat, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "carType=" + carType +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", seat=" + seat +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                '}';
    }
}
