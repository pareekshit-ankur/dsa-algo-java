package main.java.com.pareekshit.scaler.recursion;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(0, 0, 1));
        System.out.println(pow(2, 3, 3));
        System.out.println(pow(-1, 1, 20));
        System.out.println(pow(71045970, 41535484, 64735492));
    }

    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        long ans = power(A, B, C);
        return Math.floorMod(ans, C);
    }

    public static long power(int A, int B, int C) {
        if (A == 0) {
            return 0;
        }
        if (B == 0) {
            return 1;
        }
        long x = power(A, B / 2, C);
        if (B % 2 == 0) {
            return (int) Math.floorMod(x * x, C);
        } else {
            return (int) Math.floorMod(Math.floorMod(Math.floorMod(x * x, C) * A, C), C);
        }
    }

}
