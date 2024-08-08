package main.java.com.pareekshit;

public class B1 extends A1 {

    public static void sound() {
        System.out.println("Roar");
    }

    public static void main(String[] args) {
        A1 a = new B1();
        a.sound();
    }
}
