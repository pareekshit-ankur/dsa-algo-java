package main.java.com.pareekshit.leetcode.easy;

public class FindMostFrequentVowelAndConsonant {

    public int maxFreqSum(String s) {
        int maxVowel = 0, maxConsonant = 0;
        char[] chars = new char[26];
        for (char c : s.toCharArray()) {
            chars[c - 'a'] += 1;
        }
        maxVowel = chars[0];
        maxConsonant = chars[1];
        for (int i = 2; i < chars.length; i++) {
            if (i == 4 || i == 8 || i == 14 || i == 20) {
                maxVowel = Math.max(maxVowel, chars[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, chars[i]);
            }
        }
        return maxConsonant + maxVowel;
    }
}
