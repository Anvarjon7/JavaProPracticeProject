package de.telran.javaProPractice.multithreading.lesson3;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private static final Faker FAKER = new Faker();

    private static List<Action> generateAction(){
        List<Action> actions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Action randomAction = getRandomAction();
            actions.add(randomAction);
        }
        return actions;
    }

    private static Action getRandomAction(){
        int randomInd = (int)(Math.random() * Action.values().length);
        return Action.values()[randomInd];
    }
}
