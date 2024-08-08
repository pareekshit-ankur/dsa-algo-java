package main.java.com.pareekshit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GSLab {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.putIfAbsent(29, "A");
        map.putIfAbsent(27, "C");
        map.putIfAbsent(25, "B");
        map.putIfAbsent(24, "D");
        map.putIfAbsent(23, "D");
        System.out.println(getSortedByValue(map));
    }

    public static Map<Integer, String> getSortedByValue(Map<Integer, String> map) {
        return map.entrySet().stream().sorted(Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey
                        , Entry::getValue, (s, s2) -> s, LinkedHashMap::new));

    }

}

final class Org {

    int id;
    String name;
    List<String> addresses;

    private Org() {

    }

    public Org(int id, String name, List<String> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    //Constructor
    //getter
    //setter

    //hashcode
    //equals

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
