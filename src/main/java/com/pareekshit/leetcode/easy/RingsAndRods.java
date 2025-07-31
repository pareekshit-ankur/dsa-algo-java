package main.java.com.pareekshit.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class RingsAndRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
    public static int countPoints(String rings) {
        Set<Character>[] arr = new Set[10];
        for (int i = 0; i + 1 < rings.length(); i += 2) {
            int index = Character.getNumericValue(rings.charAt(i + 1));
            if (arr[index] == null) {
                arr[index] = new HashSet<>();
            }
            arr[index].add(rings.charAt(i));
        }
        int count = 0;
        for (Set<Character> characters : arr) {
            if (characters != null && characters.size() == 3) {
                count++;
            }
        }
        return count;
    }
}
