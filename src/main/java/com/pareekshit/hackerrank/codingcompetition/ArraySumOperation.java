package main.java.com.pareekshit.hackerrank.codingcompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArraySumOperation {

    /*
     * Complete the 'performOperations' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER_ARRAY op
     */

    public static List<Long> performOperations(int N, List<Integer> op) {
        // Write your code here
        List<Integer> numbers = new ArrayList<>();
        List<Long> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            numbers.add(i + 1);
            set.add(i + 1);
        }
        Long sum = numbers.stream().mapToLong(Integer::longValue).sum();
        for (Integer integer : op) {
            if (set.contains(integer)) {
                int temp = numbers.get(0);
                numbers.add(0, numbers.get(N - 1));
                numbers.add(N - 1, temp);
            } else {
                int n = numbers.get(N - 1);
                set.remove(n);
                numbers.remove(N - 1);
                numbers.add(N - 1, integer);
                set.add(integer);
                sum += integer - n;
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().trim().split(" ");
        int N, M;
        if (s.length == 2) {
            N = Integer.parseInt(s[0]);
            M = Integer.parseInt(s[1]);
        } else {
            N = Integer.parseInt(s[0]);
            M = Integer.parseInt(bufferedReader.readLine());
        }

        List<Integer> op = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            op.add(Integer.parseInt(bufferedReader.readLine()));
        }

        List<Long> result = performOperations(N, op);

        result.forEach(System.out::println);
        bufferedReader.close();
    }
}
