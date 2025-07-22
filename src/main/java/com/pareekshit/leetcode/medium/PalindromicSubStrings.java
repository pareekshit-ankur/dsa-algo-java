package main.java.com.pareekshit.leetcode.medium;

/**
 * Given a string s, return the number of palindromic substrings in it.
 * <p>
 * A string is a palindrome when it reads the same backward as forward.
 * <p>
 * A substring is a contiguous sequence of characters within the string.
 */
public class PalindromicSubStrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
        count = 0;
        System.out.println(countSubstrings("aaa"));
    }
    /*public static int countSubstrings(String A) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (checkPalindrome(i, i + 1, A)) {
                count++;
            }
        }
        for (int i = 0; i + 1 < A.length(); i++) {
            if (A.charAt(i) == A.charAt(i + 1)) {
                if (checkPalindrome(i, i + 1, A)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean checkPalindrome(int l, int r, String s) {
        int i = l, j = r;
        for (; i - 1 >= 0 && j + 1 < s.length(); i--, j++) {
            if (s.charAt(i - 1) != s.charAt(j + 1)) {
                return false;
            }
        }
        return true;
    }*/

    static int count = 0;

    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) { // i is the mid point
            extendPalindrome(s, i, i); // odd length;
            extendPalindrome(s, i, i + 1); // even length
        }

        return count;
    }

    private static void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
