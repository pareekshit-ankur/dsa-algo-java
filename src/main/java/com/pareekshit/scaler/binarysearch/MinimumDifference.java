package main.java.com.pareekshit.scaler.binarysearch;

public class MinimumDifference {
    public static void main(String[] args) {
        System.out.println(solve(2, 2, new int[][]{
                {8, 4}, {6, 8}
        }));
    }

    public static int solve(int A, int B, int[][] C) {
        int[] arr = new int[A];
        for (int i = 0; i < A; i++) {
            arr[i] = getMinElement(C[i]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        return min;
    }

    public static int getMinElement(int[] A) {
        int N = A.length;
        int l = 0, r = N;
        int mid = l + (r - l) / 2;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if ((mid == 0 || A[mid] > A[mid - 1]) && (mid == N - 1 || A[mid] > A[mid + 1])) {
                return A[mid];
            }
            if (mid > 0 && A[mid] > A[mid - 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return A[mid];
    }
}
