package main.java.com.pareekshit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindromeSubstring {
    static String maxSubString = "";

    //Brute Force
    public static String longestPalindromeBruteForce(String input) {
        if (input.length() == 1)
            return input;
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            for (int j = 0; j + length - 1 < input.length(); j++) {
                String s = input.substring(j, j + length);
                if (isPalindrome(s, 0, s.length() - 1)) {
                    if (s.length() > maxSubString.length()) {
                        maxSubString = s;
                    }
                }
            }
            length--;
        }
        return maxSubString;
    }

    public static boolean isPalindrome(String s, int l, int r) {
        if (s == null)
            return false;
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return isPalindrome(s, l + 1, r - 1);
    }

    public static String longestPalindrome(String input) {
        if (input == null || input.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < input.length(); i++) {
            int oddLength = checkPalindrome(input, i, i);
            int evenLength = checkPalindrome(input, i, i + 1);
            int length = Math.max(oddLength, evenLength);
            if (length > end - start) {
                start = i - ((length - 1) / 2);
                end = i + (length / 2);
            }
        }
        return input.substring(start, end + 1);
    }

    public static int checkPalindrome(String s, int l, int r) {
        if (s == null || l > r)
            return 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        String result = longestPalindrome(input);
        System.out.println(result);
        bufferedReader.close();
    }
}
