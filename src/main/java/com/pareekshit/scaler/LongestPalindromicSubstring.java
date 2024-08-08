package main.java.com.pareekshit.scaler;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaabaaa"));
        System.out.println(longestPalindrome("abba"));
    }

    public static String longestPalindrome(String A) {
        String longest = "";
        for (int i = 0; i < A.length(); i++) {
            String res = checkPalindrome(i, i, A);
            if (res.length() > longest.length()) {
                longest = res;
            }
        }
        for (int i = 0; i + 1 < A.length(); i++) {
            if (A.charAt(i) == A.charAt(i + 1)) {
                String res = checkPalindrome(i, i + 1, A);
                if (res.length() > longest.length()) {
                    longest = res;
                }
            }
        }
        return longest;
    }

    public static String checkPalindrome(int l, int r, String s) {
        int i = l, j = r;
        for (; i - 1 >= 0 && j + 1 < s.length(); i--, j++) {
            if (s.charAt(i - 1) != s.charAt(j + 1)) {
                break;
            }
        }
        return s.substring(i, j + 1);
    }
}
