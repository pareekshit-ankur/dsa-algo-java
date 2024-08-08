package main.java.com.pareekshit.scaler.arrays.prefix;

public class GenerateAllSubArrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}));
    }

    public static int[][] solve(int[] A) {
        int[][] res = new int[(A.length * (A.length + 1)) / 2][];
        int row = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int[] arr = new int[j - i + 1];
                for (int k = i, p = 0; k <= j; k++, p++) {
                    arr[p] = A[k];
                }
                res[row] = arr;
                row++;
            }
        }
        return res;
    }
}
