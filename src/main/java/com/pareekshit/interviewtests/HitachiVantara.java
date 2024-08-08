package main.java.com.pareekshit.interviewtests;

import java.util.ArrayList;
import java.util.List;

/**
 * Recamán's sequence is defined as following:
 * <p>
 * enter image description here
 * <p>
 * Simplest way to explain the sequence is: "go back, and if you can't go back, go forward".
 * <p>
 * Write a program to print first N number of Recaman's sequence.
 * <p>
 * First few numbers would be:
 * <p>
 * 0, 1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23....
 */
public class HitachiVantara {
    public static void main(String[] args) {
        int n = 15;
        List<Integer> nums = new ArrayList<>();
        int previousVal = 0;
        for (int i = 0; i < n; i++) {
            int currVal = previousVal - i;
            if (currVal > 0 && !nums.contains(currVal)) {
                nums.add(currVal);
                previousVal = currVal;
            } else {
                currVal = previousVal + i;
                previousVal = currVal;
                nums.add(currVal);
            }
        }
        nums.stream().map(num -> num + ", ").forEach(System.out::print);
    }
}
