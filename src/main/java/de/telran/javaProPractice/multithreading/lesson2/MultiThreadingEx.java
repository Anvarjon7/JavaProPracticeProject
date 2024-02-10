package de.telran.javaProPractice.multithreading.lesson2;

public class MultiThreadingEx {
    private static final Object LOCK = new Object();

    void mobileCall() throws InterruptedException{
        synchronized (LOCK){
            System.out.println("Mobile call start....... ... .. .");
            Thread.sleep(4000);
            System.out.println("****Mobile call end****");
        }
    }

    void waCall() throws InterruptedException{
        synchronized (LOCK){
            System.out.println("What's App call start....... ... .. .");
            Thread.sleep(4000);
            System.out.println("*****WA call end*****");
        }
    }

    void skypeCall() throws InterruptedException{
        synchronized (LOCK){
            System.out.println("Skype call start....... ... .. .");
            Thread.sleep(4000 );
            System.out.println("*****Skype call end*****");
        }
    }

    public static void main(String[] args) {
        Thread WAC = new Thread(new WACall());
        Thread ST = new Thread(new SkypeCall());
        Thread MT = new Thread(new MC());

        WAC.start();
        ST.start();
        MT.start();
    }


}

class MC implements Runnable{

    @Override
    public void run() {
        try{
            new MultiThreadingEx().mobileCall();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

class SkypeCall implements Runnable{

    @Override
    public void run() {
        try{
            new MultiThreadingEx().skypeCall();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

class WACall implements Runnable{

    @Override
    public void run() {
        try{
            new MultiThreadingEx().waCall();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}