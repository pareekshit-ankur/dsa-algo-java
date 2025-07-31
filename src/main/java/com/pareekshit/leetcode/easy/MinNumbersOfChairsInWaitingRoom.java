package main.java.com.pareekshit.leetcode.easy;

public class MinNumbersOfChairsInWaitingRoom {
    public int minimumChairs(String s) {
        int chairs =0, max =0;
        for (char c : s.toCharArray()) {
            if (c=='E'){
                chairs++;
            }else {
                chairs--;
            }
            max = Math.max(max, chairs);
        }
        return Math.abs(max);
    }
}
