package main.java.com.pareekshit.leetcode.easy;

public class CheckIfWordEqualsSummationOfTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb = new StringBuilder();
        for (char c : firstWord.toCharArray()) {
            sb.append(c - 'a');
        }
        long num1 = Long.parseLong(sb.toString());
        sb.setLength(0);
        for (char c : secondWord.toCharArray()) {
            sb.append(c - 'a');
        }
        long num2 = Long.parseLong(sb.toString());
        sb.setLength(0);
        for (char c : targetWord.toCharArray()) {
            sb.append(c - 'a');
        }
        long num3 = Long.parseLong(sb.toString());
        return (num1 + num2 == num3);
    }
}
