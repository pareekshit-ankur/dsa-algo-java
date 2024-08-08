package main.java.com.pareekshit.inheritance;

public class Parent {
    int i = 10;

    public static void m1() {
        System.out.println("Parent static method");
    }

    public void m2() {
        System.out.println("Parent instance method m2");
    }

    protected void m3() {
        System.out.println("Parent instance method m3");
    }

    public void print() {
        System.out.println("Print Parent");
    }
}
