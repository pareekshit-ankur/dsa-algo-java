package main.java.com.pareekshit.leetcode.easy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        int count = 0;
        int ans = Integer.MIN_VALUE;
        while(count<= (nums.length-k) && !heap.isEmpty()){
            ans = heap.poll();
            count++;
        }
        return ans;
    }
}
