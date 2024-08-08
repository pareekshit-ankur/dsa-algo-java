package main.java.com.pareekshit.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        //System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
        System.out.println(countGoodSubstrings("owuxoelszb"));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        if (s.length() < 3) {
            return count;
        }

        for (int i = 0; i <= s.length() - 3; i++) {
            set.clear();
            for (int j = i; j < i + 3; j++) {
                set.add(s.charAt(j));
            }
            if (set.size() == 3) {
                count++;
            }
        }
        return count;
    }
}
