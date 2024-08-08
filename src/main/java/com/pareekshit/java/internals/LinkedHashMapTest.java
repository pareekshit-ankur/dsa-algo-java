package main.java.com.pareekshit.java.internals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        Map<String, Integer> linkedHashMap = IntStream.range(0, 10000).boxed().collect(Collectors.toMap(String::valueOf, i -> 1, (a, b) -> a, LinkedHashMap::new));
        IntStream.range(0, 10000).parallel().mapToObj(i -> linkedHashMap.get(String.valueOf(i)) + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("Total time for Execution is: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        Map<String, Integer> hashMap = IntStream.range(0, 10000).boxed().collect(Collectors.toMap(String::valueOf, i -> 1, (a, b) -> a));
        IntStream.range(0, 10000).parallel().mapToObj(i -> hashMap.get(String.valueOf(i)) + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("Total time for Execution is: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        Map<String, Integer> concurrentHashMap = IntStream.range(0, 10000).boxed().collect(Collectors.toMap(String::valueOf, i -> 1, (a, b) -> a, ConcurrentHashMap::new));
        IntStream.range(0, 10000).parallel().mapToObj(i -> concurrentHashMap.get(String.valueOf(i)) + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("Total time for Execution is: " + (System.currentTimeMillis() - start));

    }
}
