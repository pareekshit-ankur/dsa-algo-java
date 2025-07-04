package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test5 {
    public static void main(String[] args) {
       /* List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> even = integers.stream().filter(integer -> integer % 2 == 0).toList();

        String s1 = "Java is great and Java is fun. Programming in Java is great.";
        String[] arr = s1.split(" ");
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String string : arr) {
            String s = string;
            if (string.contains(".")) {
                s = string.replace(".", " ").trim();
            }
            if (set.contains(s)) {
                count++;
            } else {
                set.add(s);
            }

        }
        System.out.println(count);*/


        ArrayList<Integer> list = new ArrayList<>();
        String s2 = "pareekshit";
        char[] arr = s2.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " " + characterIntegerEntry.getValue());
        }
        map.entrySet().stream().filter(es -> es.getValue() > 1).toList().forEach(System.out::println);
        /*List<Map.Entry<Character, Integer>> cs = map.entrySet().stream().filter(es-> es.getValue()>1).toList();
        cs.forEach(System.out::println);*/
        /*System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{-1,-3}));*/
        System.out.println(solution("NEENWN"));
        System.out.println(solution("NWNENWNEN"));
        List<String> stringList = List.of("abc", "xyz", "pqr");
        String status = null;
        stringList.stream().filter(s -> true).forEach(System.out::println);
        int [] ar = {1,2,3,4,5,2,3,4,5};
        Arrays.stream(Arrays.stream(ar).boxed().distinct().toList().stream().mapToInt(Integer::intValue).toArray()).forEach(System.out::println);
    }

    public static int solution(int[] A) {
        // Implement your solution here
        int max = A[0];
        for (int i : A) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max -> " + max);
        int[] arr = new int[max + 1];
        for (int i : A) {
            if (i > 0) {
                arr[i] = 1;
            }
        }
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            System.out.println(i + " -> " + arr[i]);
            if (arr[i] == 0) {
                return i;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return i;
    }

    public static String solution(String forth) {
        // Implement your solution here
        int countE = 0, countW = 0, countN = 0, countS = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : forth.toCharArray()) {
            if (ch == 'E') {
                sb.append("W");
            } else if (ch == 'W') {
                sb.append("E");
            } else if (ch == 'N') {
                sb.append("S");
            } else {
                sb.append("N");
            }
        }
        String rev = sb.toString();
        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < rev.length(); j++) {
            char ch = rev.charAt(j);
            if (ch == 'E') {
                countE++;
            } else if (ch == 'W') {
                countW++;
            } else if (ch == 'N') {
                countN++;
            } else {
                countS++;
            }
        }
        ans.append("W");
        if (countW > countE) {
            for (int i = 0; i < countW - countE; i++) {
                ans.append("W");
            }
        }
        if (countS > countN) {
            for (int i = 0; i < countS - countN; i++) {
                ans.append("S");
            }
        }
        if (countE > countW) {
            for (int i = 0; i < countE - countW; i++) {
                ans.append("E");
            }
        }
        ans.append("E");
        return ans.toString();
    }
}
