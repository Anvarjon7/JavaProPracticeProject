package de.telran.javaProPractice.collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Cherry");
        strings.add("Peach");
        strings.add("PineApple");
        strings.add(1,"Lime");
        System.out.println(strings.get(1));

        strings.set(3,"Strawberry");

        System.out.println(strings.size());
        for (String fruits : strings){
            System.out.println(fruits);
        }

        if (strings.contains("Apple")){
            System.out.println("ArrayList contains Apple");
        }
        strings.remove("Apple");
        strings.remove(2);

        Object[] objects = strings.toArray();
        for (Object fruits : objects){
            System.out.println(fruits);
        }
    }
}
