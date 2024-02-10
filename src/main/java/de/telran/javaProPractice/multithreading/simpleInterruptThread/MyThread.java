package de.telran.javaProPractice.multithreading.simpleInterruptThread;

class MyThread2 implements Runnable {
    private boolean isActive;

    void disable() {
        isActive = false;
    }

    public MyThread2() {
        isActive = true;
    }

    @Override
    public void run() {
        System.out.printf("%s started.... \n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) {
            System.out.println("Loop " + counter++);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started....");

        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2, "MyThread").start();

        try {
            Thread.sleep(1000);
            myThread2.disable();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished....");
    }

}