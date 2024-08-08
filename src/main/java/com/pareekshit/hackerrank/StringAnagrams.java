package main.java.com.pareekshit.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class StringAnagrams {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<Integer> anagrams = new ArrayList<>();
        Map<Map<Character, Integer>, Integer> dictionaryMap = new HashMap();
        for (String word : dictionary) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word.toCharArray()) {
                map.computeIfPresent(c, (key, value) -> value + 1);
                map.putIfAbsent(c, 1);
            }
            dictionaryMap.computeIfPresent(map, (key, value) -> value + 1);
            dictionaryMap.putIfAbsent(map, 1);
        }
        for (String q : query) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : q.toCharArray()) {
                map.computeIfPresent(c, (key, value) -> value + 1);
                map.putIfAbsent(c, 1);
            }
            int count = 0;
            if (dictionaryMap.containsKey(map)) {
                count += dictionaryMap.get(map);
            }
            anagrams.add(count);
        }
        return anagrams;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> result = stringAnagram(dictionary, query);

        System.out.println(result.toString());

        bufferedReader.close();

    }
}