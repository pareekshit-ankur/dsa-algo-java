package main.java.com.pareekshit.scaler.binarysearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 7}));
        System.out.println(solve(new int[]{2, 2, 3}));
    }

    public static int solve(int[] A) {
        int N = A.length;
        int l = 0, r = N - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((mid == 0 || A[mid] != A[mid - 1]) && (mid == N - 1 || A[mid] != A[mid + 1])) {
                return A[mid];
            }
            if (mid > 0 && A[mid] == A[mid - 1]) {
                if (mid % 2 == 1) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (mid % 2 == 0) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
