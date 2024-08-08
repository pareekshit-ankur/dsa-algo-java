package main.java.com.pareekshit.leetcode.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElementsWithMaximumFrequency {

    public static void main(String[] args) {

    }

    public int maxFrequencyElementsJava8(int[] nums) {
        int max, count;
        Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));
        max = map.values().stream().mapToInt(value -> value).max().orElse(Integer.MIN_VALUE);
        count = map.values().stream().filter(value -> value == max).mapToInt(value -> value).sum();
        return count;
    }

    public int maxFrequencyElements(int[] nums) {
        int max, count;
        Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));
        max = map.values().stream().mapToInt(value -> value).max().orElse(Integer.MIN_VALUE);
        count = map.values().stream().filter(value -> value == max).mapToInt(value -> value).sum();
        return count;
    }
}
