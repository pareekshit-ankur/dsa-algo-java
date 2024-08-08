package main.java.com.pareekshit.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class TaskOfPairing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int freqCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> freq = IntStream.range(0, freqCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Long::parseLong)
                .collect(toList());

        long result = taskOfPairing(freq);
        System.out.println(result);
        bufferedReader.close();
    }

    public static long taskOfPairing(List<Long> freq) {
        // Write your code here
        int maxPairs = 0;
        for (int i = 0; i + 1 < freq.size(); i++) {
            maxPairs += freq.get(i) / 2;
            freq.set(i, freq.get(i) % 2);
            maxPairs += freq.get(i + 1) / 2;
            freq.set(i + 1, freq.get(i + 1) % 2);
            if (freq.get(i) == 1 && freq.get(i + 1) == 1) {
                maxPairs++;
                freq.set(i, 0L);
                freq.set(i + 1, 0L);
            }
        }
        return maxPairs;
    }
}
