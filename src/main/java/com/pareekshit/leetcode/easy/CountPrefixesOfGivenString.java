package main.java.com.pareekshit.leetcode.easy;

public class CountPrefixesOfGivenString {
    public int countPrefixes(String[] words, String s) {
        int count =0;
        for (String word : words) {
            if (s.startsWith(word)){
                count++;
            }
        }
        return count;
    }
}
