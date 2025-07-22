package main.java.com.pareekshit.leetcode.easy;

/**
 * A word is considered valid if:
 *
 * It contains a minimum of 3 characters.
 * It contains only digits (0-9), and English letters (uppercase and lowercase).
 * It includes at least one vowel.
 * It includes at least one consonant.
 * You are given a string word.
 *
 * Return true if word is valid, otherwise, return false.
 *
 * Notes:
 *
 * 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
 * A consonant is an English letter that is not a vowel.
 */
public class ValidWord {
    public boolean isValid(String word) {
        if (word.length()<3)return false;
        char [] arr = word.toCharArray();
        boolean containsVowel = false, containsConsonant = false;
        for (char c : arr) {
            if (!Character.isLetterOrDigit(c)) return false;
            if (Character.isLetter(c)){
                if (!containsVowel && isVowel(c)) containsVowel = true;
                if (!containsConsonant && !isVowel(c)) containsConsonant = true;
            }
        }
        return containsVowel && containsConsonant;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
