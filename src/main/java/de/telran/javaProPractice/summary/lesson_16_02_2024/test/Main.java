package de.telran.javaProPractice.summary.lesson_16_02_2024.test;

import java.sql.Timestamp;
import java.time.Instant;


public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        int max = findMax(arr);
        System.out.println(max);
//        getTime(arr);

    }

    public static int findMax(Integer[] arr) throws NullPointerException{
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

//    public static void getTime(int[] arr) {
//        Timestamp start = Timestamp.from(Instant.now());
//        int max = findMax(arr);
//        Timestamp end = Timestamp.from(Instant.now());
//        System.out.println(end.getTime() - start.getTime());
//    }

}

