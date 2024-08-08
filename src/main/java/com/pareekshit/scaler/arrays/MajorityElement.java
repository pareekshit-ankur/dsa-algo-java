package main.java.com.pareekshit.scaler.arrays;

//Moore's Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 1, 1}));
    }

    public static int majorityElement(final int[] A) {
        int elem = A[0];
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == elem) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    elem = A[i];
                    count = 1;
                }
            }
        }
        int freq = 0;
        for (int j : A) {
            if (j == elem) {
                freq++;
            }
        }
        if (freq > A.length / 2) {
            return elem;
        } else {
            return -1;
        }
    }
}
