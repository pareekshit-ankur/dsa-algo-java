package main.java.com.pareekshit.leetcode.easy;

public class CountingWordsWithGivenPrefix {

    public int prefixCount(String[] words, String pref) {
        int count =0;
        for (String word : words) {
            if (word.startsWith(pref)) count++;
        }
        return count;
    }
}
