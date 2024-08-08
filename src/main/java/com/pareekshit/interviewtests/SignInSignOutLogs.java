package main.java.com.pareekshit.interviewtests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SignInSignOutLogs {

    /**
     * 6
     * 99 1 sign-in
     * 100 10 sign-in
     * 50 20 sign-in
     * 100 15 sign-out
     * 50 26 sign-out
     * 99 2 sign-out
     * 5
     *
     * @param logs
     * @param maxSpan
     * @return
     */
    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER maxSpan
     */
    public static List<String> processLogs(List<String> logs, int maxSpan) {
        // Write your code here
        List<String> users = new ArrayList<>();
        Map<String, Integer> userDelta = new HashMap<>();
        for (String log : logs) {
            String[] inputs = log.trim().split(" ");
            if (userDelta.containsKey(inputs[0])) {
                int delta = Math.abs(Integer.parseInt(inputs[1]) - userDelta.get(inputs[0]));
                if (delta <= maxSpan) users.add(inputs[0]);
            } else {
                userDelta.putIfAbsent(inputs[0], Integer.parseInt(inputs[1]));
            }
        }
        return users.stream().map(Integer::valueOf).sorted()
                .map(String::valueOf).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int maxSpan = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = processLogs(logs, maxSpan);

        result.forEach(System.out::println);

        bufferedReader.close();

    }
}