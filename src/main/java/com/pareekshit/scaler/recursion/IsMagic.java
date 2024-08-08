package main.java.com.pareekshit.scaler.recursion;

public class IsMagic {
    public static void main(String[] args) {

        System.out.println(solve(83557));
        System.out.println(solve(1291));
    }

    public static int solve(int A) {
        if (A == 1) {
            return 1;
        } else if (A <= 9) {
            return 0;
        }
        int count = 0;
        int n = A;
        while (n > 0) {
            count = count + (n % 10);
            n = n / 10;
        }
        return solve(count);
    }
}
