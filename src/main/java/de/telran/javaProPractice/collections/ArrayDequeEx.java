package de.telran.javaProPractice.collections;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        states.add("UZB");
        states.addFirst("USA");
        states.push("Germany");
        states.addLast("Russia");
        states.add("Italy");

        String sFirst = states.getFirst();
        System.out.println(sFirst);
        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.println(states.size());

        while (states.peek() != null){
            System.out.println(states.pop());
        }

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.add(new Person("Tom"));
        people.addFirst(new Person("Anna"));
        people.addLast(new Person("Nick"));
        for (Person p : people){
            System.out.println(p.getName());
        }
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(String value) {
        this.name = value;
    }

    public String getName() {
        return name;
    }
}