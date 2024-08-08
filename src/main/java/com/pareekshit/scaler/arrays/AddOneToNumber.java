package main.java.com.pareekshit.scaler.arrays;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        Arrays.stream(plusOne(new int[]{1, 2, 3})).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(plusOne(new int[]{9, 9, 9, 9, 9})).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
        Arrays.stream(plusOne(new int[]{0, 3, 7, 6, 4, 0, 5, 5, 5})).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
    }

    public static int[] plusOne(int[] A) {
        int carry = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 9 && carry == 1) {
                A[i] = 0;
                carry = 1;
            } else if (A[i] == 9 && carry == 0) {
                A[i] = 0;
                carry = 1;
            } else {
                A[i] = A[i] + 1;
                carry = 0;
                break;
            }
        }
        if (carry == 1) {
            int[] ans = new int[A.length + 1];
            ans[0] = 1;
            return ans;
        }
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                index = i;
                break;
            }
        }
        int[] arr = new int[A.length - index];
        for (int i = 0, j = index; j < A.length; i++, j++) {
            arr[i] = A[j];
        }
        return arr;
    }
}
