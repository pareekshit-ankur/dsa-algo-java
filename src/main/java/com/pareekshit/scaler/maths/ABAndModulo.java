package main.java.com.pareekshit.scaler.maths;

public class ABAndModulo {
    public static void main(String[] args) {
        System.out.println(1 % 2);
        System.out.println(solve(1, 2));
        System.out.println(solve(5, 10));
    }

    public static int solve(int A, int B) {
        return Math.abs(A - B);
    }
}
