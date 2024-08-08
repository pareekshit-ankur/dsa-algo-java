package main.java.com.pareekshit.scaler.binarysearch;

public class FindAPeakElement {
    public static void main(String[] args) {
        //System.out.println(solve(new int[]{1, 2, 3, 4, 5}));
        //System.out.println(solve(new int[]{5, 17, 100, 11}));
        //System.out.println(solve(new int[]{2,3}));
        System.out.println(solve(new int[]{1, 1000000000, 1000000000}));
    }

    public static int solve(int[] A) {
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
