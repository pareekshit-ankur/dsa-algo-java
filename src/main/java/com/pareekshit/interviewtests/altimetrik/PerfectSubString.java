package main.java.com.pareekshit.interviewtests.altimetrik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class PerfectSubString {
    static HashSet<String> substrings = new HashSet<>();

    public static int perfectSubstring(String s, int k) {
        // Write your code here
        int counter = k;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j + counter <= s.length(); j++) {
                if (substrings.contains(s)) {
                    count++;
                } else {
                    String substring = s.substring(j, j + counter);
                    if (isPerfectSubString(substring, k)) {
                        count++;
                        substrings.add(substring);
                    }
                }
            }
            counter += k;
        }
        return count;
    }

    public static int perfectSubstring1(String s, int k, int l, int r) {
        // Write your code here
        int counter = k;
        int count = 0;
        if (s.length() < k)
            return 0;
        if (substrings.contains(s)) {
            return 1;
        }
        if (isPerfectSubString(s.substring(s.length(), 1), 0))
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j + counter <= s.length(); j++) {
                    if (substrings.contains(s)) {
                        count++;
                    } else {
                        String substring = s.substring(j, j + counter);
                        if (isPerfectSubString(substring, k)) {
                            count++;
                            substrings.add(substring);
                        }
                    }
                }
                counter += k;
            }
        return count;
    }

    public static boolean isPerfectSubString(String s, int k) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.computeIfPresent(c, (key, value) -> value + 1);
            map.putIfAbsent(c, 1);
        }
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != k)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = perfectSubstring(s, k);
        System.out.println(result);
        bufferedReader.close();
    }
}
