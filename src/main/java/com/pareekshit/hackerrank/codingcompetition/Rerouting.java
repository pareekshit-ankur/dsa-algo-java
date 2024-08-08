package main.java.com.pareekshit.hackerrank.codingcompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Rerouting {

    /*
     * Complete the 'getMinConnectionChange' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY connection as parameter.
     */

    public static int getMinConnectionChange(List<Integer> connection) {
        // Write your code here
        int freeNodes = 0;
        for (int i = 0; i < connection.size(); i++) {
            if (connection.get(i) == i + 1) freeNodes++;
        }
        if (freeNodes == 1) return 1;
        else return freeNodes - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> connection = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = getMinConnectionChange(connection);
        System.out.println(result);
        bufferedReader.close();

    }
}
