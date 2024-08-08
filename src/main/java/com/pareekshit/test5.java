package main.java.com.pareekshit;

import java.util.*;

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
        map.entrySet().stream().filter(es-> es.getValue()>1).toList().forEach(System.out::println);
        /*List<Map.Entry<Character, Integer>> cs = map.entrySet().stream().filter(es-> es.getValue()>1).toList();
        cs.forEach(System.out::println);*/
    }
}
