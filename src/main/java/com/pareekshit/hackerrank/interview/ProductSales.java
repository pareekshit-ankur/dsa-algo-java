package main.java.com.pareekshit.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ProductSales {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inventoryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> inventory = IntStream.range(0, inventoryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long order = Long.parseLong(bufferedReader.readLine().trim());

        long result = maximumProfit1(inventory, order);
        System.out.println(result);
        bufferedReader.close();
    }

    /*
     * Complete the 'maximumProfit' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY inventory
     *  2. LONG_INTEGER order
     */

    public static long maximumProfit(List<Integer> inventory, long order) {
        // Write your code here
        /*PriorityQueue<Integer> availableInventory =
                new PriorityQueue<>(Comparator.reverseOrder());
        availableInventory.addAll(inventory);
        long profit = 0;
        while (order > 0) {
            Integer current = availableInventory.poll();
            if (!availableInventory.isEmpty()
                    && ((current + availableInventory.peek()) - order) <= 0) {
                Integer next = availableInventory.poll();
                if (current.equals(next)) {
                    profit += 2 * current;
                    availableInventory.add(current - 1);
                    availableInventory.add(next - 1);
                    order -= 2;
                } else {
                    int i;
                    for (i = current; i > next; i--) {
                        profit += i;
                        order--;
                    }
                    availableInventory.add(i);
                    availableInventory.add(i);
                }
            } else {
                profit += current;
                availableInventory.add(current - 1);
                order--;
            }
        }
        return profit;*/

        /*long res = 0;
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b)->b-a);
        maxHeap.addAll(inventory);
        while(!maxHeap.isEmpty() && order-- > 0) {
            int cur = maxHeap.poll();
            res += cur;
            if(cur > 0)
                maxHeap.offer(cur-1);
        }
        return res;*/

        Queue<Integer> availableInventory =
                new PriorityQueue<>(Comparator.reverseOrder());
        availableInventory.addAll(inventory);
        long profit = 0;
        while (!availableInventory.isEmpty() && order-- > 0) {
            Integer n = availableInventory.poll();
            profit += n;
            if (n > 0)
                availableInventory.offer(n - 1);
        }
        return profit;
    }

    public static long maximumProfit1(List<Integer> inventory, long order) {
        // Write your code here
        long profit = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        inventory.forEach(integer -> {
            map.computeIfPresent(integer, (key, value) -> value + 1);
            map.putIfAbsent(integer, 1);
        });
        while (order > 0) {
            Integer current = map.firstKey();
            Integer val = map.get(current);
            long res = val > order ? val - order : val;
            profit += current * res;
            order -= val;
            map.remove(current);
            map.computeIfPresent(current - 1, (key, value) -> value + (val));
            map.putIfAbsent(current - 1, val);
        }
        return profit;
    }
}
