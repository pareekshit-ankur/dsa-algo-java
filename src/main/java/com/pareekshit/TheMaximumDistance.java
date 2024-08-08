package main.java.com.pareekshit;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class TheMaximumDistance implements Serializable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] Queries = new int[Q][2];
        for (int i_Queries = 0; i_Queries < Q; i_Queries++) {
            String[] arr_Queries = br.readLine().split(" ");
            for (int j_Queries = 0; j_Queries < arr_Queries.length; j_Queries++) {
                Queries[i_Queries][j_Queries] = Integer.parseInt(arr_Queries[j_Queries]);
            }
        }

        long[] result = solve(Q, Queries);
        Arrays.stream(result).forEach(System.out::println);
        wr.close();
        br.close();
    }

    static long[] solve(int Q, int[][] Queries) {
        // Write your code here
        TreeMap<Integer, Integer> xAxisPlot = new TreeMap<>();
        List<Long> tempRes = new ArrayList<>();
        long x1, x2;
        int xAxisTime = 1;
        for (int[] query : Queries) {
            if (query[0] == 1) {
                xAxisPlot.put(xAxisTime++, query[1]);
            } else if (query[0] == 2) {
                xAxisPlot.remove(query[1]);
            } else {
                x1 = xAxisPlot.get(xAxisPlot.firstKey());
                x2 = query[1];
                tempRes.add(Math.abs(x1 - x2));
            }
        }
        return tempRes.stream().mapToLong(value -> value).toArray();
    }
}
