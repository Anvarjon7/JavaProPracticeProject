package de.telran.javaProPractice.summary.lesson_23_02_2024.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator(String route) {
        this.route = route;
    }

    public GPSNavigator() {
        this.route = "Home";
    }

    public String getRoute() {
        return route;
    }
}
