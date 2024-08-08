package main.java.com.pareekshit.scaler.bitmanipulation;

public class StrangeEquality {
    public static void main(String[] args) {
        System.out.println(solve(5));
        System.out.println(solveOptimal(5));
    }

    public static int solve(int A) {
        int x = 0, y = 0;
        for (int i = A; i >= 0; i--) {
            if ((A ^ i) == A + i) {
                x = i;
                break;
            }
        }
        for (int i = A; i < Integer.MAX_VALUE; i++) {
            if ((A ^ i) == A + i) {
                y = i;
                break;
            }
        }
        return x ^ y;
    }

    public static int solveOptimal(int A) {
        int totalBits = 0;
        for (int i = 31; i >= 0; i--) {
            if ((A & (1 << i)) > 0) {
                totalBits = i;
                break;
            }
        }
        int y = (1 << totalBits + 1);
        int x = A;
        for (int i = totalBits; i >= 0; i--) {
            x = x ^ (1 << i);
        }

        return x ^ y;
    }
}
