package main.java.com.pareekshit.hackerrank.algorithms.implementation;

import java.util.*;
import java.util.stream.Collectors;

public class FlatLandSpaceStations {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int maxDist = 0, minDist;
        TreeSet<Integer> stations = Arrays.stream(c).boxed()
                .collect(Collectors.toCollection(TreeSet::new));
        Set<Integer> cities = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!stations.contains(i)) {
                cities.add(i);
            }
        }
        for (Integer city : cities) {
            minDist = Math.min(Math.abs(city - Optional.ofNullable(stations.floor(city))
                            .orElse(Integer.MAX_VALUE)),
                    Math.abs(city - Optional.ofNullable(stations.ceiling(city))
                            .orElse(Integer.MAX_VALUE)));
            if (maxDist < minDist) {
                maxDist = minDist;
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        scanner.close();
    }
}
