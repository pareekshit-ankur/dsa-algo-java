package main.java.com.pareekshit.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    static Set<String> words = new HashSet<>();

    public static void main(String[] args) {

        permutateString("abcd", 0, 3);
        permutateIntegerArray(new int[]{10, 20, 30}, 0, 2);
    }

    public static void permutateString(String s, int l, int r) {
        if (l == r) {
            if (!words.contains(s)) {
                System.out.println(s);
            }
            words.add(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = interchangeCharacters(s, l, i);
            permutateString(s, l + 1, r);
            s = interchangeCharacters(s, l, i);
        }
    }

    private static String interchangeCharacters(String s, int a, int b) {
        char[] arr = s.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);
    }

    public static void permutateIntegerArray(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = l; i <= r; i++) {
            interchangeNumbers(arr, l, i);
            permutateIntegerArray(arr, l + 1, r);
            interchangeNumbers(arr, l, i);
        }
    }

    private static void interchangeNumbers(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
