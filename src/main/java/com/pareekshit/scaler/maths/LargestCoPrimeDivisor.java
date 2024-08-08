package main.java.com.pareekshit.scaler.maths;

public class LargestCoPrimeDivisor {
    public static void main(String[] args) {
        System.out.println(cpFact(30, 12));
    }

    public static int cpFact(int A, int B) {
        int x = gcd(A, B);
        if (x == 1) {
            return A;
        }
        return cpFact(A / x, B);
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, Math.floorMod(A, B));
    }
}
