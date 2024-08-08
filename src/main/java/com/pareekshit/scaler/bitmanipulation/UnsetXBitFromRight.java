package main.java.com.pareekshit.scaler.bitmanipulation;

public class UnsetXBitFromRight {
    public static void main(String[] args) {
        System.out.println(solve(25, 3));
        System.out.println(solve(37, 3));
    }

    public static long solve(long A, int B) {
        for (int i = B - 1; i >= 0; i--) {
            if ((A & (1 << i)) > 0) {
                A = A ^ (1 << i);
            }
        }
        return A;
    }
}
