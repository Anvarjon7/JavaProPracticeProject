package de.telran.javaProPractice.staticEx;

import java.sql.SQLOutput;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        System.out.println(car1.model + " -> " + car1.count);
        Car car2 = new Car("Mercedes-Benz");
        System.out.println(car2.model + " -> " + car2.count);

        Car.inc();
        System.out.println(Car.count);
        car1.setYear(2020);
        System.out.println(Car.COUNT_EARS);
    }
}
