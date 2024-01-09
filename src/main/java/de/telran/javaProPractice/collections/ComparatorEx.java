package de.telran.javaProPractice.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class AgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }
        else if (o1.getAge() < o2.getAge()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
class Main{
    public static void main(String[] args) {
        Comparator<Person> personComparator = new ComparatorEx().thenComparing(new AgeComparator());
        TreeSet<Person> personTreeSet = new TreeSet<>(personComparator);
        personTreeSet.add(new Person("Nick",14));
        personTreeSet.add(new Person("Viktor",23));
        personTreeSet.add(new Person("Jack",34));
        personTreeSet.add(new Person("David",43));

        for (Person p : personTreeSet){
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
