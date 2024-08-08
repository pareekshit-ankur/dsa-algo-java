package main.java.com.pareekshit.hackerrank;


import java.util.*;

public class IceCreamParlor {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, TreeSet<Integer>> costMap = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            TreeSet<Integer> ts;
            set.add(cost[i]);
            if (costMap.containsKey(cost[i])) {
                ts = costMap.get(cost[i]);
                ts.add(i);
                costMap.put(cost[i], ts);
            } else {
                ts = new TreeSet<>();
                ts.add(i);
                costMap.put(cost[i], ts);
            }
        }
        int val1, val2;
        for (Integer i : set) {
            if (set.contains(money - i)) {
                TreeSet<Integer> ts = costMap.get(i);
                val1 = ts.pollFirst() + 1;
                costMap.put(i, ts);
                ts = costMap.get(money - i);
                if (!ts.isEmpty()) {
                    val2 = ts.pollFirst() + 1;
                    System.out.print(Math.min(val1, val2) + " " + Math.max(val1, val2));
                    System.out.println();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
