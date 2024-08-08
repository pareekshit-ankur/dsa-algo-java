package main.java.com.pareekshit.multithreading;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable " + Thread.currentThread().getName());
    }
}
