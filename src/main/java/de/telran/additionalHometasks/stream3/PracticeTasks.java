package de.telran.additionalHometasks.stream3;

import de.telran.javaProPractice.Person;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeTasks {
    public static void main(String[] args) {
        Methods.m1();
        Methods.m2();
        Methods.m3();
        Methods.m4();

        /**
         * Подсчитать буквы в нижнем и верхнем регистре **/

        String ss = "KikJhYggfTgf";
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        for(char c : ss.toCharArray()){
            if (Character.isLowerCase(c)){
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of uppercase letters: " + uppercaseCount);

//***********************************************************************************

        /**
         * Определите все символьные строки максимальной длины в заданном конечном
         потоке символьных строк. через Optional  **/

         Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
         Optional<Map.Entry<Integer, List<String>>> max =  stream.collect(
                 Collectors.groupingBy(String::length))
                 .entrySet()
                 .stream()
                 .max(Map.Entry.comparingByKey());

         max.ifPresent(entry -> {
             System.out.println("Max length of lines: " + entry.getKey());
             System.out.println("Min length of lines: " + entry.getValue());
         });

//***********************************************************************************


    }

    class Methods {
        /**
         * Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
         */
        private static void m1() {
            List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
            String substringSearch = "Java";
            int count = (int) list.stream()
                    .filter(t -> t.contains(substringSearch))
                    .count();
            System.out.println("Number of lines containing the substring " + substringSearch + " = " + count);
        }

//*************************************************************************************

        /**
         * Дан список целых чисел. Необходимо найти максимальный
         * элемент списка, который делится на заданное число без остатка.
         **/
        public static void m2() {
            List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
            int num = 3;
            Integer maxEl = list.stream()
                    .filter(s -> s % num == 0)
                    .max(Integer::compareTo)
                    .orElse(null);

            if (maxEl != null) {
                System.out.println("MAX element,that divisible by " + num + ": " + maxEl);
            } else {
                System.out.println("NoSuchElementException");
            }
        }

//*************************************************************************************

        /**
         * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
         * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
         */
        private static void m3() {
            List<Person> people = Arrays.asList(
                    new Person("John", 20),
                    new Person("Jane", 25),
                    new Person("Jack", 30),
                    new Person("James", 35),
                    new Person("Jill", 40)
            );
            char letter = 'J';
            double searchAvgAge = people.stream()
                    .filter(person -> person.getName().charAt(0) == letter)
                    .mapToInt(Person::getAge)
                    .average()
                    .orElse(0.0);

            System.out.println("The average age of people whose name begin with the letter " + letter + ": " + searchAvgAge);
        }

//*************************************************************************************

        /**
         * Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
         * этой коллекции строк, и вернуть их в виде списка.
         */
        private static void m4() {
            List<String> lines = Arrays.asList(
                    "Java is a programming language.",
                    "Java is widely used in enterprise applications.",
                    "Python is gaining popularity as a data science tool.",
                    "Python is a versatile programming language."
            );
            List<String> uniqueWords = lines.stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .map(String::toLowerCase)
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Unique words in the collection line:");
            uniqueWords.forEach(System.out::println);
        }

//*************************************************************************************




    }
}