package main.java.com.pareekshit.recursion;

public class CalculatePower {

    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }

    public static long power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }
}
