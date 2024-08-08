package main.java.com.pareekshit.inheritance;

public class Child extends Parent {
    int i = 20;

    public static void m1() {
        System.out.println("Child static method");
    }

    public void m2() {
        System.out.println("Child instance method m2");
    }

    public void m3() {
        System.out.println("Child instance method m3");
    }

    public void print() {
        System.out.println("Print Child");
    }

    public void show() {
        System.out.println("Show Child");
    }
}
