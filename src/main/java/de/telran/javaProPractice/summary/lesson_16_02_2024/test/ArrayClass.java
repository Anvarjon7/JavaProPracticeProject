package de.telran.javaProPractice.summary.lesson_16_02_2024.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(3);

//        boolean isAdd = isAddElem(list, 3);
//        System.out.println(isAdd);
//        System.out.println(list);

        System.out.println(arrLength(list));




    }

    public static int arrLength(List<Integer> arr){
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            count++;
        }
        return count;
    }

    public static boolean isAddElem(List<Integer> arr, int elem) {
        if (arr.size() < 10) {
            arr.add(elem);
            return true;
        } else {
            return false;
        }
    }
}
