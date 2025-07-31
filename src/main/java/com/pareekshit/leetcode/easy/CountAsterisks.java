package main.java.com.pareekshit.leetcode.easy;

public class CountAsterisks {

    public int countAsterisks(String s) {
        char[] arr = s.toCharArray();
        int count = 0, pipeCount = 0;
        boolean pair = false;
        for (char c : arr) {
            if (c == '|') {
                pipeCount += 1;
                if (pipeCount == 2) {
                    pair = false;
                    pipeCount = 0;
                } else {
                    pair = true;
                }
            }
            if (c == '*' && !pair) {
                count++;
            }
        }
        return count;
    }
}
