package main.java.com.pareekshit.scaler.maths;

public class DivisorGame {
    public static void main(String[] args) {

        System.out.println(solve(12, 3, 2));
        System.out.println(solve(130974912, 7022, 7683));
        System.out.println(solve(52503, 9013, 2254));
    }

    public static int solve(int A, int B, int C) {
        int lcm = (B * C) / gcd(B, C);
        return A / lcm;
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
