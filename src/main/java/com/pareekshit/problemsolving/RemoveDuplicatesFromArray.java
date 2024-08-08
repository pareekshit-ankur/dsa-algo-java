package main.java.com.pareekshit.problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Integer[] duplicates = new Integer[]{1, 1, 2, 2, 9, 4, 3, 5, 6, 7, 8, 8};
        System.out.println(Arrays.toString(duplicates));
        System.out.println(Arrays.toString(removeDuplicatesUsingSet(duplicates)));
        System.out.println(Arrays.toString(removeDuplicatesWithoutSorting(duplicates)));
    }

    public static Integer[] removeDuplicatesUsingSet(Integer[] numbers) {
        HashSet<Integer> unique = new HashSet<>();
        Collections.addAll(unique, numbers);
        numbers = unique.toArray(new Integer[0]);
        return numbers;
    }

    public static Integer[] removeDuplicatesWithoutSorting(Integer[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == null) continue;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i].equals(numbers[j])) {
                    numbers[j] = null;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != null) {
                numbers[count] = numbers[i];
                count++;
            } else continue;
        }
        return Arrays.copyOf(numbers, count);
    }

}
