package main.java.com.pareekshit.hackerrank.codingcompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class TheXORProblem {


    /*
     * Complete the 'maxXorValue' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING x
     *  2. INTEGER k
     */

    public static String maxXorValue(String x, int k) {
        // Write your code here
        char[] charX = x.toCharArray();
        StringBuilder y = new StringBuilder();
        int count = 0;
        int i;
        for (i = 0; i < charX.length && count < k; i++) {
            if (charX[i] == '0') {
                y.append(1);
                count++;
            } else y.append(0);
        }
        for (; i < charX.length; i++) {
            y.append(0);
        }
        return y.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();
                int k = Integer.parseInt(bufferedReader.readLine().trim());

                String y = maxXorValue(s, k);

                System.out.println(y);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
