package main.java.com.pareekshit.scaler.hashing;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ColorfulNumbers {
    public static void main(String[] args) {
        System.out.println(colorful(23));
        System.out.println(colorful(236));
    }

    private static int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int n = A;
        while (n != 0) {
            stack.push(n % 10);
            n = n / 10;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = i; j < arr.length; j++) {
                prod *= arr[j];
                if (set.contains(prod)) {
                    return 0;
                } else {
                    set.add(prod);
                }
            }
        }
        return 1;
    }
}
