package de.telran.javaProPractice.summary.lesson_16_02_2024.callableEx;

public class Account {
    int sum = 1000;
    boolean isClosed = false;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum > 0) {
            this.sum = sum;
        }else {
            isClosed = true;
        }
    }
}
