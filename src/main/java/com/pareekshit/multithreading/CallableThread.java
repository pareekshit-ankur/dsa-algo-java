package main.java.com.pareekshit.multithreading;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Boolean> {
    public Boolean call() throws Exception {
        return Boolean.TRUE;
    }
}
