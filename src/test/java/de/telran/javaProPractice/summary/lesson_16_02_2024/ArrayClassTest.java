package de.telran.javaProPractice.summary.lesson_16_02_2024;

import org.junit.jupiter.api.Test;
import static de.telran.javaProPractice.summary.lesson_16_02_2024.test.ArrayClass.isAddElem;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassTest {

    @Test
    void isAddElemTrueTest() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(7);
        assertTrue(isAddElem(list,8));
    }

    @Test
    void isAddElemFalseTest(){
        List<Integer> list = new ArrayList<>(List.of(1,2,45,6,7,8,8,4));
        assertTrue(isAddElem(list,3));
    }
}