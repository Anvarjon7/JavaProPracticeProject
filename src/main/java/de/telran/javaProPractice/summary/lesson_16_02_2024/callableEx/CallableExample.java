package de.telran.javaProPractice.summary.lesson_16_02_2024.callableEx;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable {

    Account account;

    public CallableExample(Account account) {
        this.account = account;
    }

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        int num = random.nextInt(500);
        if (account.getSum() - num < 0 || account.isClosed){
            throw new IllegalStateException("You don't have enough money -> " + num);
        }
        account.setSum(account.getSum() - num);
        return num;
    }
}