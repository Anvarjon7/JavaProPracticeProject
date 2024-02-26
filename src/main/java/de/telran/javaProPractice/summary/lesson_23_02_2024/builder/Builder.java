package de.telran.javaProPractice.summary.lesson_23_02_2024.builder;

import de.telran.javaProPractice.summary.lesson_23_02_2024.car.Car;
import de.telran.javaProPractice.summary.lesson_23_02_2024.car.CarType;
import de.telran.javaProPractice.summary.lesson_23_02_2024.components.*;

public interface Builder {
    void setCarType(CarType carType);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setSeats(int seat);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
