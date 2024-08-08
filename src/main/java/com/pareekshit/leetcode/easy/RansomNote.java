package main.java.com.pareekshit.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /**
     * Given an arbitrary ransom note string and another string containing letters from all the magazines,
     * write a function that will return true if the ransom note can be constructed from the magazines ;
     * otherwise, it will return false.
     * <p>
     * Each letter in the magazine string can only be used once in your ransom note.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: ransomNote = "a", magazine = "b"
     * Output: false
     * Example 2:
     * <p>
     * Input: ransomNote = "aa", magazine = "ab"
     * Output: false
     * Example 3:
     * <p>
     * Input: ransomNote = "aa", magazine = "aab"
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * You may assume that both strings contain only lowercase letters.
     *
     * @param magazine
     * @param ransomNote
     * @return
     */

    public boolean isRansomFromMagazine(String magazine, String ransomNote) {
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            characterMap.computeIfPresent(c, (key, value) -> value + 1);
            characterMap.putIfAbsent(c, 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!characterMap.containsKey(c)) {
                return false;
            } else {
                int count = characterMap.get(c);
                if (count == 0) {
                    characterMap.remove(c);
                    return false;
                } else {
                    characterMap.compute(c, (key, value) -> value - 1);
                }
            }
        }
        return true;
    }
}

