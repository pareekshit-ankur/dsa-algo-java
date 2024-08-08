package main.java.com.pareekshit.scaler.sorting;

public class InversionCountInAnArray {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 3, 2}));
        System.out.println(solve(new int[]{3, 4, 1, 2}));
        System.out.println(solve(new int[]{45, 10, 15, 25, 50}));
    }

    public static int solve(final int[] A) {
        return sort(A, 0, A.length - 1);
    }

    public static int sort(int[] A, int l, int r) {
        int count = 0;
        if (l == r) {
            return count;
        }
        int mid = (l + r) / 2;
        count += sort(A, l, mid);
        count += sort(A, mid + 1, r);
        count += merge(A, l, mid, r);
        return count % mod;
    }

    public static int merge(int[] A, int l, int mid, int r) {
        int[] arr = new int[r - l + 1];
        int i, j, index = 0, count = 0;
        for (i = l, j = mid + 1; i <= mid && j <= r; ) {
            if (A[i] <= A[j]) {
                arr[index++] = A[i++];
            } else {
                arr[index++] = A[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) {
            arr[index++] = A[i++];
        }
        while (j <= r) {
            arr[index++] = A[j++];
        }
        for (i = 0; i < arr.length; i++) {
            A[l + i] = arr[i];
        }
        return count % mod;
    }
}
