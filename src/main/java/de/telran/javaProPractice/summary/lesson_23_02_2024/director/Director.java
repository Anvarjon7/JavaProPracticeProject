package de.telran.javaProPractice.summary.lesson_23_02_2024.director;

import de.telran.javaProPractice.summary.lesson_23_02_2024.builder.Builder;
import de.telran.javaProPractice.summary.lesson_23_02_2024.car.CarType;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.Engine;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.GPSNavigator;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.Transmission;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.TripComputer;

public class Director {
    public void sportCar(Builder builder){
        builder.setCarType(CarType.SPORT_CAR);
        builder.setEngine(new Engine(4.5,40));
        builder.setSeats(2);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
    }

    public void truck(Builder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setTripComputer(new TripComputer());
        builder.setEngine(new Engine(8,3000));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setSeats(2);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void cityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setTripComputer(new TripComputer());
        builder.setEngine(new Engine(1.4,44444));
        builder.setTransmission(Transmission.ROBOT);
        builder.setSeats(5);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
