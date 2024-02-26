package de.telran.javaProPractice.summary.lesson_23_02_2024.builder;

import de.telran.javaProPractice.summary.lesson_23_02_2024.car.Car;
import de.telran.javaProPractice.summary.lesson_23_02_2024.car.CarType;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.*;

public class CarBuilder implements Builder{

    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private int seat;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setSeats(int seat) {
        this.seat = seat;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getcar(){
        return new Car(carType,engine, transmission, seat, tripComputer, gpsNavigator);
    }
}
