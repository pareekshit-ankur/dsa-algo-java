package main.java.com.pareekshit.leetcode.medium;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Set<Character> characters = new TreeSet<>(Comparator.reverseOrder());
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character);
        }
        return sb.reverse().toString();
    }
}
