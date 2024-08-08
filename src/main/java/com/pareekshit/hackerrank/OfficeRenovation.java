package main.java.com.pareekshit.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class OfficeRenovation {
    /*
     * Complete the 'getMaxArea' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER w
     *  2. INTEGER h
     *  3. BOOLEAN_ARRAY boundaryType
     *  4. INTEGER_ARRAY boundaryDist
     */

    public static List<Long> getMaxArea(int w, int h, List<Boolean> boundaryType, List<Integer> boundaryDist) {
        // Write your code here
        List<Long> maxArea = new ArrayList<>();
        long x1 = 0, x2 = w, y1 = 0, y2 = h;
        for (int i = 0; i < boundaryType.size(); i++) {
            Boolean bType = boundaryType.get(i);
            if (!bType) {
                if (boundaryDist.get(i) <= h / 2) {
                    y1 = boundaryDist.get(i);
                } else {
                    y2 = boundaryDist.get(i);
                }
            } else {
                if (boundaryDist.get(i) <= w / 2) {
                    x1 = boundaryDist.get(i);
                } else {
                    x2 = boundaryDist.get(i);
                }
            }
            maxArea.add(Math.abs(x2 - x1) * Math.abs(y2 - y1));
        }
        return maxArea;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(bufferedReader.readLine().trim());

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int boundaryTypeCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Boolean> boundaryType = IntStream.range(0, boundaryTypeCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(e -> Integer.parseInt(e) != 0)
                .collect(toList());

        int boundaryDistCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> boundaryDist = IntStream.range(0, boundaryDistCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Long> result = getMaxArea(w, h, boundaryType, boundaryDist);

        result.forEach(System.out::println);

        bufferedReader.close();
    }
}
