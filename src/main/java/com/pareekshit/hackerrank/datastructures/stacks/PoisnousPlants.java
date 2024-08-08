package main.java.com.pareekshit.hackerrank.datastructures.stacks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PoisnousPlants {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
        int noOfDays = 0, swapCount = 0;
        List<Integer> plants = new ArrayList<>();
        List<Integer> flags = new ArrayList<>();
        for (int plant : p) {
            plants.add(plant);
        }
        while (swapCount != -1) {
            for (int i = 0; i < plants.size() - 1; i++) {
                if (plants.get(i) < plants.get(i + 1)) {
                    flags.add(i + 1);
                    swapCount++;
                }
            }
            for (int i = 0; i < flags.size(); i++) {
                int f = flags.get(i) - i;
                plants.remove(f);
            }
            flags.clear();
            if (swapCount > 0) {
                noOfDays++;
                swapCount = 0;
            } else if (swapCount == 0) {
                swapCount = -1;
            }
        }
        return noOfDays;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants(p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    public static int poisonousPlants(List<Integer> p) {
        // Write your code here
        int days = 0;
        boolean plantDied = true;
        while (plantDied) {
            int size = p.size();
            IntStream.iterate(p.size() - 1, i -> i > 0, i -> i - 1).filter(i -> p.get(i) > p.get(i - 1)).forEachOrdered(p::remove);
            if (size == p.size()) {
                plantDied = false;
            } else {
                days++;
            }
        }
        return days;
    }
}
