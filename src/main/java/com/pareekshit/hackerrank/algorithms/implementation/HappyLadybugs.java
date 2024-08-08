package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadybugs {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        char[] arr = b.trim().toCharArray();
        int emptySpace = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (c == '_')
                emptySpace++;
            map.computeIfPresent(c, (character, integer) -> integer + 1);
            map.putIfAbsent(c, 1);
        }
        if (map.size() == 1 && map.containsValue(1) && !map.containsKey('_')) {
            return "NO";
        }
        if (map.size() == 1)
            return "YES";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() != '_' && entry.getValue() < 2) {
                return "NO";
            }
        }
        return emptySpace > 0 ? "YES" : isHappy(arr);
    }

    static String isHappy(char[] arr) {
        boolean isHappy = true;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] != arr[i + 1]) {
                isHappy = false;
            } else if (i == arr.length - 1) {
                if (arr[i] != arr[i - 1])
                    isHappy = false;
            } else {
                if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1])
                    isHappy = false;
            }
        }
        return isHappy ? "YES" : "NO";
    }

    public static void main(String[] args) {
        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();
            String result = happyLadybugs(b);
            System.out.println(result);
        }
        scanner.close();
    }
}
