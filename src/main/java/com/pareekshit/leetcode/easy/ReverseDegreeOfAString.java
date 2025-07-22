package main.java.com.pareekshit.leetcode.easy;

/**
 * Given a string s, calculate its reverse degree.
 * <p>
 * The reverse degree is calculated as follows:
 * <p>
 * For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
 * Sum these products for all characters in the string.
 * Return the reverse degree of s.
 */
public class ReverseDegreeOfAString {
    static int[] chars = new int[]{26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
        System.out.println(reverseDegree("zaza"));
    }
    public static int reverseDegree(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count += (chars[arr[i] - 'a'] * (i + 1));
        }
        return count;
    }
}
