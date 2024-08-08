package main.java.com.pareekshit.inheritance;

public interface BirdInterface {
    boolean canFly();

    default void eats() {
        System.out.println("All birds eat");
    }
}
