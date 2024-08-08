package main.java.com.pareekshit.interviewtests.altimetrik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ShoppersDelight {
    static int count = 0;

    public static long getNumberOfOptions(List<Integer> priceOfJeans, List<Integer> priceOfShoes,
                                          List<Integer> priceOfSkirts, List<Integer> priceOfTops, int budgeted) {
        if (Collections.min(priceOfJeans) + Collections.min(priceOfShoes) + Collections
                .min(priceOfSkirts) + Collections.min(priceOfTops) > budgeted) {
            return 0;
        }
        // Write your code here
        if (budgeted <= 0)
            return 0;
        if (priceOfJeans.size() != 0 && priceOfJeans.get(0) <= budgeted) {
            int n = priceOfJeans.get(0);
            priceOfJeans.remove(0);
            return 1 + getNumberOfOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops,
                    budgeted - n);
        }
        if (priceOfShoes.size() != 0 && priceOfShoes.get(0) <= budgeted) {
            int n = priceOfShoes.get(0);
            priceOfShoes.remove(0);
            return 1 + getNumberOfOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops,
                    budgeted - n);
        }
        if (priceOfSkirts.size() != 0 && priceOfSkirts.get(0) <= budgeted) {
            int n = priceOfSkirts.get(0);
            priceOfSkirts.remove(0);
            return 1 + getNumberOfOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops,
                    budgeted - n);
        }
        if (priceOfTops.size() != 0 && priceOfTops.get(0) <= budgeted) {
            int n = priceOfTops.get(0);
            priceOfTops.remove(0);
            return 1 + getNumberOfOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops,
                    budgeted - n);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int priceOfJeansCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> priceOfJeans = IntStream.range(0, priceOfJeansCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int priceOfShoesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> priceOfShoes = IntStream.range(0, priceOfShoesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int priceOfSkirtsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> priceOfSkirts = IntStream.range(0, priceOfSkirtsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int priceOfTopsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> priceOfTops = IntStream.range(0, priceOfTopsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int budgeted = Integer.parseInt(bufferedReader.readLine().trim());

        long result = getNumberOfOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops,
                budgeted);
        System.out.println(result);
        bufferedReader.close();

    }
}
