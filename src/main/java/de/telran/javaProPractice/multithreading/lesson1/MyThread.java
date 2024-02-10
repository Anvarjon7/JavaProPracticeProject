package de.telran.javaProPractice.multithreading.lesson1;

import java.util.concurrent.Callable;

public class MyThread {
    public static void main(String[] args) throws Exception {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FirstCallableThread callable1 = new FirstCallableThread(arr);
        SecondCallableThread callable2 = new SecondCallableThread(arr);

        Thread thread1 = new Thread(String.valueOf(callable1));
        thread1.start();
        Thread thread2 = new Thread(String.valueOf(callable2));
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int sumThread1 = callable1.call();
        int sumThread2 = callable2.call();

        System.out.println("Sum of first thread -> " + sumThread1);
        System.out.println("Sum of second thread -> " + sumThread2);

        System.out.println("Both threads have finished");
    }
}

class FirstCallableThread implements Callable<Integer> {
    private int[] arr;

    public FirstCallableThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println("Thread 1 -> " + arr[i]);
            sum += arr[i];
        }
        return sum;
    }
}

class SecondCallableThread implements Callable<Integer> {
    private int[] arr;

    public SecondCallableThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.println("Thread 2 -> " + arr[i]);
            sum += arr[i];
        }
        return sum;
    }
}
//Создайте класс SharedResourceRunner, который использует общий ресурс в виде списка строк.
// Несколько потоков должны добавлять строки в этот список, а один контрольный
//поток должен завершать работу всех потоков, когда в списке накопится достаточно строк(сами условия придумайте)