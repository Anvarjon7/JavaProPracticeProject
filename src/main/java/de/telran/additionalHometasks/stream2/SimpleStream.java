package de.telran.additionalHometasks.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> oddNumbers = integerList.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

//        ============================================================================================

        //Задание 2: Преобразование списка строк в список чисел
        List<String> strings = Arrays.asList("1", "2", "34", "45", "56");

        List<Integer> stringsToInt = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        ============================================================================================

        //Задание 3: Суммирование списка чисел
        Integer sumNumbers = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();

//        ============================================================================================

        //Задание 4: Определение максимального значения в списке
        Integer maxElem = integerList.stream()
                .mapToInt(Integer::intValue)
                .max().orElseThrow();

//        ============================================================================================

        //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> stringsList = Arrays.asList("apple", "orange", "cherry", "banana", "avocado", "a", "banana");
        char letter = 'a';
        List<String> toUpperCase = stringsList.stream()
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

//        ============================================================================================

        //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов

        List<String> uniqueWords = stringsList.stream()
                .map(String::toLowerCase)
                .filter(s -> s.length() > 4)
                .distinct()
                .collect(Collectors.toList());

//        ============================================================================================

        //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
        List<Person> people = Arrays.asList(new Person("John", 25),
                new Person("Alice", 22),
                new Person("Bob", 30));

        List<String> sortByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());

//        ============================================================================================

        //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------

        Integer sum = integerList.stream()
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

//        ============================================================================================

        //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
