package main.java.com.pareekshit.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {701, 1, 875, 85, 908, 236, 234, 53, 9, 265};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Integer[] numbers1 = {701, 1, 875, 85, 908, 236, 234, 53, 9, 265};
        Arrays.sort(numbers1, Collections.reverseOrder());
        sort1(numbers1);
        System.out.println(Arrays.toString(numbers1));
    }

    public static void sort(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                count++;
                if (numbers[i] < numbers[j]) {
                    numbers[i] = numbers[i] + numbers[j];
                    numbers[j] = numbers[i] - numbers[j];
                    numbers[i] = numbers[i] - numbers[j];
                }
            }
        }
        System.out.println("Count -> " + count);
    }

    public static void sort1(Integer[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int minNumIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                count++;
                if (numbers[minNumIndex] > numbers[j]) {
                    minNumIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minNumIndex];
            numbers[minNumIndex] = temp;
        }
        System.out.println("Count -> " + count);
    }
}
