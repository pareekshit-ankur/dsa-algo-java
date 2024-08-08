package main.java.com.pareekshit.scaler.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(46));
    }

    public static int solve(int A) {
        if (A == 0) {
            return 0;
        }
        return A % 10 + solve(A / 10);
    }
}
