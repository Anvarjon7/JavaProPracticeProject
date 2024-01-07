package de.telran.javaProPractice.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Seoul");
        states.add("Great Britain");

        System.out.println(states.size());

        states.remove("Seoul");
        for (String s : states){
            System.out.println(s);
        }
        System.out.println(states.first());
        System.out.println(states.last());

        SortedSet<String> strings = states.subSet("Germany","Italy");
        System.out.println(strings);

    }
}
