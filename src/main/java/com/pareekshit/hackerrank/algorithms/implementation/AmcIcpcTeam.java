package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmcIcpcTeam {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int[] result = new int[2];
        int count, max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i + 1 < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                count = topic[0].length();
                for (int k = 0; k < topic[0].length(); k++) {
                    if (topic[i].charAt(k) == '0' && topic[j].charAt(k) == '0') {
                        count--;
                    }
                }
                map.computeIfPresent(count, (key, value) -> value + 1);
                map.putIfAbsent(count, 1);
                if (max < count) {
                    max = count;
                }
            }
        }
        result[0] = max;
        result[1] = map.get(max);
        return result;
    }

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        Arrays.stream(result).forEach(System.out::println);
        scanner.close();
    }
}
