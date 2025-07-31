package main.java.com.pareekshit.leetcode.easy;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        System.out.println(vowelStrings(new String[]{"are", "amy", "u"}, 0, 2));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (String word : words) {
            if (right < word.length()) {
                if (isVowel(word.charAt(left)) && isVowel(word.charAt(right))) {
                    count++;
                }
            } else {
                if (isVowel(word.charAt(left)) && isVowel(word.charAt(word.length() - 1))) {
                    count++;
                }
            }

        }
        return count;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
