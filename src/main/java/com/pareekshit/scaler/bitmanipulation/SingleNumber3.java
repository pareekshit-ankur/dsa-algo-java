package main.java.com.pareekshit.scaler.bitmanipulation;

public class SingleNumber3 {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{186, 256, 102, 377, 186, 377}));
    }

    public static int[] solve(final int[] A) {
        int x = A[0];
        for (int i = 1; i < A.length; i++) {
            x ^= A[i];
        }
        int pos = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & (1 << i)) > 0) {
                pos = i;
                break;
            }
        }
        int n1 = 0, n2 = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & (1 << pos)) > 0) {
                n1 ^= A[i];
            } else {
                n2 ^= A[i];
            }
        }
        if (n1 < n2) {
            return new int[]{n1, n2};
        }
        return new int[]{n2, n1};
    }
}
