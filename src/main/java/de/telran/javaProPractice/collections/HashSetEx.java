package de.telran.javaProPractice.collections;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Germany");
        set.add("France");
        set.add("Italy");

        boolean isAdded = set.add("Germany");
        System.out.println(isAdded);

        System.out.println(set.size());

        for (String state : set){
            System.out.println(state);
        }

        set.remove("Germany");

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Jane"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for (Person p : people){
            System.out.println(p.getName());
        }

    }
}
