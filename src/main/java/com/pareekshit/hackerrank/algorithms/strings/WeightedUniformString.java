package main.java.com.pareekshit.hackerrank.algorithms.strings;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformString {

    private static final String EMPTY_STRING = "";
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        String[] result = new String[queries.length];
        String[] input = s.trim().toLowerCase().split("");
        String temp = EMPTY_STRING;
        int weight = 0;
        Set<Integer> weights = new HashSet<>();
        for (String value : input) {
            if (temp.equals(EMPTY_STRING)) {
                temp = value;
                weight = (value.charAt(0) - 'a') + 1;
                weights.add(weight);
            } else if (temp.contains(value)) {
                temp = temp.concat(value);
                weight = temp.length() * ((value.charAt(0) - 'a') + 1);
                weights.add(weight);
            } else {
                temp = value;
                weight = (value.charAt(0) - 'a') + 1;
                weights.add(weight);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (weights.contains(queries[i]))
                result[i] = "Yes";
            else
                result[i] = "No";
        }
        return result;

    }

    /*static String[] weightedUniformStrings(String s, int[] queries) {
        String[] result = new String[queries.length];
        Set<Integer> weights = new HashSet<>();
        Map<Character, Integer> charCount = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c) + 1;
                weights.add(count * ((c - 'a') + 1));
                charCount.putIfAbsent(c, count);
            } else {
                weights.add((c - 'a') + 1);
                charCount.put(c, ((c - 'a') + 1));
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (weights.contains(queries[i]))
                result[i] = "Yes";
            else
                result[i] = "No";
        }
        return result;

    }*/

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        scanner.close();
    }
}
