package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindromeWithoutApi(-121));
    }

    public static boolean isPalindrome(int x) {
        try {
            StringBuilder s = new StringBuilder();
            s.append(x);
            return x == Integer.parseInt(String.valueOf(s.reverse()));
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean isPalindromeWithoutApi(int x) {
        if (x < 0) return false;
        List<Integer> digits = new ArrayList<>();
        int n = x;
        while (n != 0) {
            digits.add(n % 10);
            n = n / 10;
        }
        for (int i = 0, j = digits.size() - 1; i <= j; i++, j--) {
            if (digits.get(i) != digits.get(j)) return false;
        }
        return true;
    }
}
