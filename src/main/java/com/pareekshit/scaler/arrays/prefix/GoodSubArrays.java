package main.java.com.pareekshit.scaler.arrays.prefix;

public class GoodSubArrays {
    public static void main(String[] args) {
        System.out.println(solveOptimal2(new int[]{3, 12, 11, 11, 11, 15}, 12));
    }

    public static int solveOptimal2(int[] A, int B) {
        int count = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if ((j + 1 - i) % 2 == 0) {
                    if (sum < B) {
                        count++;
                    }
                } else {
                    if (sum > B) {
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
