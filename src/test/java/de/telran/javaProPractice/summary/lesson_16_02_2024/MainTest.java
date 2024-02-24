package de.telran.javaProPractice.summary.lesson_16_02_2024;

import org.junit.jupiter.api.Test;

import static de.telran.javaProPractice.summary.lesson_16_02_2024.test.Main.findMax;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findMaxTest() {
        Integer[] arr = {2,1,5,9};
        int max = findMax(arr);
        assertEquals(9,findMax(arr));
    }

    @Test
    void findMaxEmptyArrTest(){
        Integer[] arr = new Integer[5];
        assertThrows(NullPointerException.class, () -> findMax(arr));
    }
}