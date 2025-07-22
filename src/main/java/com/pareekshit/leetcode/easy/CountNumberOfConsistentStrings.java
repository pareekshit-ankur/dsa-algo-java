package main.java.com.pareekshit.leetcode.easy;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
 * <p>
 * Return the number of consistent strings in the array words.
 * <p>
 * Example 1:
 * <p>
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 * Example 2:
 * <p>
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 * Example 3:
 * <p>
 * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * Output: 4
 * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 104
 * 1 <= allowed.length <= 26
 * 1 <= words[i].length <= 10
 * The characters in allowed are distinct.
 * words[i] and allowed contain only lowercase English letters.
 */
public class CountNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> allowedChars = allowed.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        for (String word : words) {
            Set<Character> wordChars = word.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toSet());
            if (allowedChars.containsAll(wordChars)) count++;
        }
        return count;
    }
}
