package main.java.com.pareekshit.leetcode.easy;

public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        for (; i < word1.length() && j < word2.length(); i++, j++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
        }
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));
        return sb.toString();
    }
}
