package main.java.com.pareekshit.interviewtests.altimetrik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class DistinctCharactersOfName {
    public static List<String> findDistinct(List<String> names, String prefix) {
        List<String> filteredNames = new ArrayList<>();
        List<String> namesWithPrefix =
                names.stream().filter(s -> s.startsWith(prefix)).collect(Collectors.toList());

        for (String name : names) {
            if (name.startsWith(prefix)) {
                HashSet<String> s = new HashSet<>(Arrays.asList(name.split("")));
                filteredNames.add(name + " - " + s.size());
            }
        }
        return filteredNames;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int namesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> names = IntStream.range(0, namesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String prefix = bufferedReader.readLine();

        List<String> result = findDistinct(names, prefix);
        result.forEach(System.out::println);
        bufferedReader.close();
    }
}
