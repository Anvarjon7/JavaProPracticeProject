package de.telran.javaProPractice.summary.lesson_23_02_2024;

import de.telran.javaProPractice.summary.lesson_23_02_2024.builder.Builder;
import de.telran.javaProPractice.summary.lesson_23_02_2024.builder.CarBuilder;
import de.telran.javaProPractice.summary.lesson_23_02_2024.builder.CarManualBuilder;
import de.telran.javaProPractice.summary.lesson_23_02_2024.car.Car;
import de.telran.javaProPractice.summary.lesson_23_02_2024.car.ManualCar;
import de.telran.javaProPractice.summary.lesson_23_02_2024.director.Director;

public class SimpleCar {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.cityCar(builder);
        Car car = builder.getcar();
        System.out.println(car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.sportCar(manualBuilder);
        ManualCar manualCar = manualBuilder.getcar();
        System.out.println(manualCar);
    }
}
