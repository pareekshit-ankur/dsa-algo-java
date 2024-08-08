package main.java.com.pareekshit.hackerrank;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;

public class PoisonousPlants {

    // Complete the poisonousPlants function below.
    /*static int poisonousPlants(int[] p) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int noOfDays = 0, swapCount = 0, arrCount = 0;
        int[] arr = new int[p.length];
        int[] marker = new int[p.length];
        while (swapCount != -1) {
            for (int i = 0; i + 1 < p.length; i++) {
                if (p[i] < p[i + 1]) {
                    marker[i + 1] = 1;
                    swapCount++;
                }
            }
            for (int i = 0; i < p.length; i++) {
                if (marker[i] != 1) {
                    arr[arrCount] = p[i];
                    arrCount++;
                }
            }
            marker = new int[arrCount];
            p = new int[arrCount];
            for (int i = 0; i < arrCount; i++) {
                p[i] = arr[i];
            }
            arrCount = 0;
            if (swapCount > 0) {
                noOfDays++;
                swapCount = 0;
            } else if (swapCount == 0) {
                swapCount = -1;
            }
        }
        return noOfDays;
    }*/

    /*static int poisonousPlants(int[] p) {
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
    }*/

    private static final Scanner scanner = new Scanner(System.in);

    static int poisonousPlants(int[] p) {
        Deque<Integer> stack = new ArrayDeque<>();
        int noOfDays = 0, noOfPlantsDied = 0;
        Integer visitedNum = null;
        while (noOfPlantsDied != -1) {
            for (int i = 0; i < p.length - 1; i++) {
                if (p[i] < p[i + 1]) {
                    if (Objects.isNull(visitedNum) || visitedNum != p[i]) {
                        stack.add(p[i]);
                    }
                    visitedNum = p[i + 1];
                    noOfPlantsDied++;
                } else if (p[i] >= p[i + 1]) {
                    if (i + 1 == p.length - 1) {
                        if (Objects.isNull(visitedNum) || visitedNum != p[i]) {
                            stack.add(p[i]);
                            stack.add(p[i + 1]);
                        }
                        if (Objects.nonNull(visitedNum) && visitedNum == p[i]) {
                            stack.add(p[i + 1]);
                        }
                    } else {
                        if (Objects.isNull(visitedNum) || visitedNum != p[i]) {
                            stack.add(p[i]);
                        }
                    }
                }
            }
            if (noOfPlantsDied > 0) {
                noOfDays++;
                noOfPlantsDied = 0;
            } else if (noOfPlantsDied == 0) {
                noOfPlantsDied = -1;
            }
            p = stack.stream().mapToInt(i -> i).toArray();
            stack.clear();
            visitedNum = null;
        }
        return noOfDays;
    }

    public static void main(String[] args) throws IOException {
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

        System.out.println(result);

        scanner.close();
    }
}
