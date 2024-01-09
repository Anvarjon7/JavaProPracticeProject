package de.telran.javaProPractice.collections;

import java.util.NavigableSet;
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

        String greater = states.higher("Germany");
        System.out.println(greater);

        String lower = states.lower("Germany");
        System.out.println(lower);

        NavigableSet<String> navigableSet = states.descendingSet();
        SortedSet<String> sortedSet = states.headSet("Germany");

        SortedSet<String> sortedSet1 = states.tailSet("Germany");

        System.out.println(navigableSet);
        System.out.println(sortedSet);
        System.out.println(sortedSet1);


    }
}
