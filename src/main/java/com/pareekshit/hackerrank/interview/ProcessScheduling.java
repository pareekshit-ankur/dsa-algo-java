package main.java.com.pareekshit.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ProcessScheduling {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int abilityCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ability = IntStream.range(0, abilityCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long processes = Long.parseLong(bufferedReader.readLine().trim());

        int result = minimumTime(ability, processes);

        System.out.println(result);
        bufferedReader.close();

    }

    /*
     * Complete the 'minimumTime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ability
     *  2. LONG_INTEGER processes
     */

    public static int minimumTime(List<Integer> ability, long processes) {
        // Write your code here
        PriorityQueue<Integer> processors =
                new PriorityQueue<>(Comparator.reverseOrder());
        processors.addAll(ability);
        int steps = 0;
        while (processes > 0 && !processors.isEmpty()) {
            Integer n = processors.poll();
            processes -= n;
            processors.add(n / 2);
            steps++;
        }
        return steps;
    }
}
