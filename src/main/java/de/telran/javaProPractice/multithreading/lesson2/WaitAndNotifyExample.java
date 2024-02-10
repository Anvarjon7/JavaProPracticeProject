package de.telran.javaProPractice.multithreading.lesson2;


public class WaitAndNotifyExample {
    public static void main(String[] args) {
        Robot robot =new Robot();

        Producer producer = new Producer(robot);
        Consumer consumer = new Consumer(robot);

        Thread threadProd = new Thread(producer);
        Thread threadCons = new Thread(consumer);

        threadCons.start();
        threadProd.start();

    }
}

class Robot{
    private int item = 0;

    public synchronized void get(){
        while(item < 1){
            try{
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        item--;
        System.out.println("Robot got 1 item");
        System.out.println("Number of items is: " + item);
        notify();
    }

    public synchronized void put(){
        while(item >= 5){
            try {
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        item++;
        System.out.println("Robot put 1 item");
        System.out.println("Number of items is: " + item);
        notify();
    }
}

class  Producer implements Runnable{

    private Robot robot;

    public Producer(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            robot.put();
        }
    }
}

class Consumer implements Runnable{

    private Robot robot;

    public Consumer(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            robot.get();
        }
    }
}