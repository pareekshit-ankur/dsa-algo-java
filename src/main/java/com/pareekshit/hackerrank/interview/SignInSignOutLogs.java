package main.java.com.pareekshit.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SignInSignOutLogs {

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
        Map<String, Long> loginTime = new HashMap<>();
        Map<String, Long> logoutTime = new HashMap<>();
        Set<Integer> users = new TreeSet<>();
        for (String log : logs) {
            String[] arr = log.split(" ");
            if (arr[2].equalsIgnoreCase("SIGN-IN")) {
                if (logoutTime.containsKey(arr[0])
                        && logoutTime.get(arr[0]) - Long.parseLong(arr[1]) <= maxSpan) {
                    users.add(Integer.valueOf(arr[0]));
                } else {
                    loginTime.putIfAbsent(arr[0], Long.parseLong(arr[1]));
                }
            } else {
                if (loginTime.containsKey(arr[0])
                        && Long.parseLong(arr[1]) - loginTime.get(arr[0]) <= maxSpan) {
                    users.add(Integer.valueOf(arr[0]));
                } else {
                    logoutTime.putIfAbsent(arr[0], Long.parseLong(arr[1]));
                }

            }
        }
        List<String> result = new ArrayList<>();
        users.forEach(integer -> result.add(String.valueOf(integer)));
        return result;
    }
}
