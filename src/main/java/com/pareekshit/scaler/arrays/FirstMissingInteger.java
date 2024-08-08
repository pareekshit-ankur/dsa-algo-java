package main.java.com.pareekshit.scaler.arrays;

public class FirstMissingInteger {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{-8, -7, -6}));
    }

    public static int firstMissingPositive(int[] A) {
        int i = 0, N = A.length;
        while (i < N) {
            if (A[i] >= 1 && A[i] <= N) {
                // elements should be present on currentIndex if its val is in [1, N].
                int currentIndex = A[i] - 1;
                if (A[currentIndex] != A[i]) {
                    // swap values of A[i] and A[currentIndex]
                    int temp = A[currentIndex];
                    A[currentIndex] = A[i];
                    A[i] = temp;
                } else {
                    i += 1;
                }
            } else {
                i += 1;
            }
        }

        int result = 0;

        for (i = 0; i < A.length; i++) {
            if (A[i] - 1 != i) {
                result = i + 1;
                return result;
            }
        }
        return N + 1;
    }
}
