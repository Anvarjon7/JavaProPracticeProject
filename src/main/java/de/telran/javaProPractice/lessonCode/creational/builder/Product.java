package de.telran.javaProPractice.lessonCode.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        this.parts.add(part);
    }

    public void show(){
        parts.stream().forEach(System.out::println);
    }
}
