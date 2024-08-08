package main.java.com.pareekshit.scaler.maths;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
