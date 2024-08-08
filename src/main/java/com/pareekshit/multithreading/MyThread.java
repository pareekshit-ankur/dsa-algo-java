package main.java.com.pareekshit.multithreading;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running using Thread " + Thread.currentThread().getName());
    }
}
