package de.telran.javaProPractice.multithreading.lesson2;

import com.github.javafaker.Faker;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(4);

        Thread producer = new Thread(() -> {
            String[] strings = new String[10];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = new Faker().name().title();
            }

            for (int i = 0; i < strings.length && !Thread.interrupted(); i++) {
                try{
                    Thread.sleep(2000);
                    queue.put(strings[i]);
                    System.out.println("Producer put: " + strings[i] + " || Number: " + queue.size());
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder stringBuilder = new StringBuilder();
            while (!Thread.interrupted()){
                try {
                    stringBuilder.setLength(0);
                    Thread.sleep(5000);
                    stringBuilder.append(queue.take());
                    System.out.println("Consumer get: " + stringBuilder.reverse() + " || Number: " + queue.size());
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
