package main.java.com.pareekshit.hackerrank.codingcompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JewelGame {

    /*
     * Complete the 'getMaxScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING jewels as parameter.
     */

    public static int getMaxScore(String jewels) {
        // Write your code here
        int score = 0, count = 1;
        List<Character> chars = jewels.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        while (count != 0) {
            count = 0;
            for (int i = 0; i + 1 < chars.size(); i++) {
                if (chars.get(i) == chars.get(i + 1)) {
                    count++;
                    chars.remove(i + 1);
                    chars.remove(i);
                }
            }
            score += count;
        }
        return score;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String jewels = bufferedReader.readLine();

                int ans = getMaxScore(jewels);

                System.out.println(ans);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
