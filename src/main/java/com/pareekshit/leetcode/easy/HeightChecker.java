package main.java.com.pareekshit.leetcode.easy;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] res = Arrays.copyOf(heights, heights.length);;
        Arrays.sort(res);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (res[i] != heights[i]) count++;
        }
        return count;
    }
}
