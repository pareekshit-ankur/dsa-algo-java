package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123 Output: 321 Example 2:
 * <p>
 * Input: -123 Output: -321 Example 3:
 * <p>
 * Input: 120 Output: 21 Note: Assume we are dealing with an environment which could only store integers within the
 * 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0
 * when the reversed integer overflows.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(-321));
        System.out.println(ReverseInteger.reverse(120));
        System.out.println(ReverseInteger.reverse(123));
    }

    /*public static int reverse(int x) {
        int n = x;
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            s.append(Math.abs(n % 10));
            n = n / 10;
        }
        if (x < 0) {
            s.insert(0, '-');
        }
        int reverse;
        try {
            reverse = s.capacity() == 0 ? x : Integer.parseInt(s.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return reverse;
    }*/

    public static int reverse(int x) {
        Queue<Integer> queue = new ArrayDeque<Integer>() {
        };
        int n = x;
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            queue.add(Math.abs(n % 10));
            n = n / 10;
        }
        while (!queue.isEmpty()) {
            s.append(queue.poll());
        }
        int reverse;
        try {
            reverse = Integer.parseInt(s.toString());
            if (x < 0) {
                reverse *= -1;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
        return reverse;
    }

    public int reverseWithJavaInbuilt(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
