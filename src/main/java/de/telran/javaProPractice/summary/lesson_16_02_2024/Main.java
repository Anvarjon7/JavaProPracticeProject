package de.telran.javaProPractice.summary.lesson_16_02_2024;

import java.sql.Timestamp;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,9};
        int max = findMax(arr);
        System.out.println(max);
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

//    public static void getTime(){
//        Date date = new Date();
//        findMax()
//        Timestamp timestamp = new Timestamp(date.getTime());

    }
}
