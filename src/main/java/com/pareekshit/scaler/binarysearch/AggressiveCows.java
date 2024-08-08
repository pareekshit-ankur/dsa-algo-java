package main.java.com.pareekshit.scaler.binarysearch;

public class AggressiveCows {

    public static void main(String[] args) {
        /*System.out.println(solve(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solve(new int[]{1,2}, 2));
        System.out.println(solve(new int[]{1,2}, 3));*/
        System.out.println(solve(new int[]{5, 17, 100, 11}, 2));
    }

    public static int solve(int[] A, int B) {
        if (B == A.length) {
            return 1;
        }
        if (B > A.length) {
            return 0;
        }
        int max = 0, left = 0, right = A[A.length - 1] - A[0];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count1 = countCows(A, mid);
            int count2 = countCows(A, mid + 1);
            if (count1 >= B && count2 < B) {
                return mid;
            }
            if (count1 < B) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return max;
    }

    public static int countCows(int[] A, int B) {
        int count = 1;
        int last = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] - last >= B) {
                count++;
                last = A[i];
            }
        }
        return count;
    }
}
