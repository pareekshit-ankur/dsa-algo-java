package main.java.com.pareekshit.scaler.binarysearch;

import main.java.com.pareekshit.Util;

public class SearchForARange {
    public static void main(String[] args) {
        Util.printArray(searchRange(new int[]{1}, 1));
    }

    public static int[] searchRange(final int[] A, int B) {
        int[] ans = new int[]{-1, -1};
        int index = getIndexOfElement(A, B);
        if (index == -1) {
            return ans;
        }
        for (int i = index; i >= 0 && A[i] == B; i--) {
            ans[0] = i;
        }
        for (int j = index; j < A.length && A[j] == B; j++) {
            ans[1] = j;
        }
        return ans;
    }

    public static int getIndexOfElement(int[] A, int B) {
        int l = 0, r = A.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A[mid] == B) {
                return mid;
            }
            if (A[mid] < B) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
