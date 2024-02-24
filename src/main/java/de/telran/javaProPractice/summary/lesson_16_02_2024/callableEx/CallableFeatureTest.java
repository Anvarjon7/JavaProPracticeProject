package de.telran.javaProPractice.summary.lesson_16_02_2024.callableEx;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFeatureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Account account = new Account();
        FutureTask[] futureTasks = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            Callable callable = new CallableExample(account);
            futureTasks[i] = new FutureTask(callable);

            Thread thread = new Thread(futureTasks[i]);
            thread.start();
            System.out.println(thread.getName() + " sum withdraw " + futureTasks[i].get()+ " sum left on Account " + account.getSum());

        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(futureTasks[i].get());
//        }

    }
}
