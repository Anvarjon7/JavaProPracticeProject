package de.telran.javaProPractice.collections;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");
        states.addFirst("Spain");
        states.add(2,"Italy");

        System.out.println(states.size());
        System.out.println(states.get(2));
        states.set(2,"USA");
        for (String s : states){
            System.out.println(s);
        }
        if (states.contains("USA")){
            System.out.println("List contains USA");
        }
        states.remove("Germany");
        states.removeFirst();
        states.removeLast();

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Nina"));
        people.addLast(new Person("Roma"));
        people.remove(2);
        for (Person p : people){
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}
