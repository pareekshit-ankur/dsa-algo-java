package main.java.com.pareekshit.leetcode.easy;

/**
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * <p>
 * Given a balanced string s, split it into some number of substrings such that:
 * <p>
 * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */
public class SplitStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int rCount = 0, lCount = 0, balCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                lCount++;
            } else {
                rCount++;
            }
            if (rCount == lCount) {
                balCount++;
                rCount = 0;
                lCount = 0;
            }
        }
        return balCount;
    }
}
