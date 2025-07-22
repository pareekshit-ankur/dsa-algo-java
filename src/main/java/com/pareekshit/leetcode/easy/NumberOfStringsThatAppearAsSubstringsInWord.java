package main.java.com.pareekshit.leetcode.easy;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) count++;
        }
        return count;
    }
}
