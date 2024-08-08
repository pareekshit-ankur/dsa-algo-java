package main.java.com.pareekshit.inheritance;

public class Pigeon extends BirdClass implements BirdInterface {

    public boolean canFly() {
        System.out.println("Inside Pigeon Class");
        return true;
    }

    public boolean canFlyAbs() {
        System.out.println("Inside Pigeon Class");
        return false;
    }
}

