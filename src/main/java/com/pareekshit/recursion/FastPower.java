package main.java.com.pareekshit.recursion;

public class FastPower {

    public static void main(String[] args) {
        System.out.println(fastPower(3, 4));
    }

    public static long fastPower(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return fastPower(a * a, b / 2);
        } else {
            return a * fastPower(a, b - 1);
        }
    }
}
