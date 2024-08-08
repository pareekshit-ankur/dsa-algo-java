package main.java.com.pareekshit.interviewtests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MinimumUniqueArraySum {

    /*
     * Complete the 'getMinimumUniqueSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int count;
        for (Integer num : arr) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                int n = num;
                while (set.contains(n)) {
                    n++;
                }
                set.add(n);
            }
        }
        count = set.stream().mapToInt(n -> n).sum();
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = getMinimumUniqueSum(arr);
        System.out.println(result);

        bufferedReader.close();
    }
}