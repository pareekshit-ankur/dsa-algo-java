package main.java.com.pareekshit.leetcode.easy;

import java.util.List;

public class CheckIfAStringIsAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        return s.contentEquals(sb);
    }
}
