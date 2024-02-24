package de.telran.javaProPractice.lessonCode.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private String value;

    private Main main;

    private static volatile List<String> lists = new ArrayList<>();

    public Main() {
        lists.add("some 1");
        lists.add("some 2");
        lists.add("some 3");
    }

    public List<String> getLists(){
        return List.copyOf(lists);
    }

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director =new Director(builder);

        director.construct();

        Product product = builder.getResult();
        product.show();
    }
}
