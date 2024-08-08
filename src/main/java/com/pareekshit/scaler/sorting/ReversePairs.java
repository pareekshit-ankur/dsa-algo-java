package main.java.com.pareekshit.scaler.sorting;

public class ReversePairs {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 3, 2, 3, 1}));
        System.out.println(solve(new int[]{4, 1, 2}));
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
        count += countPairs(A, l, mid, r);
        merge(A, l, mid, r);
        return count % mod;
    }

    public static void merge(int[] A, int l, int mid, int r) {
        int[] arr = new int[r - l + 1];
        int i, j, index = 0;
        for (i = l, j = mid + 1; i <= mid && j <= r; ) {
            if (A[i] <= A[j]) {
                arr[index++] = A[i++];
            } else {
                arr[index++] = A[j++];
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
        return;
    }

    public static int countPairs(int[] A, int s, int mid, int e) {
        int ans = 0, p1 = s, p2 = mid + 1;
        while (p1 <= mid && p2 <= e) {
            if ((long) A[p1] <= (long) 2 * A[p2]) {
                p1++;
            } else {
                p2++;
                ans += mid - p1 + 1;
            }
        }
        return ans;
    }
}
