package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Capg {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = list.stream().collect(Collectors.toSet());
        List<String> duplicates = list.stream().filter(s -> set.contains(s)).collect(Collectors.toList());


    }
}
