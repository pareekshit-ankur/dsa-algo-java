package main.java.com.pareekshit.codingblocks.dailycodebytes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FunctionOfBitPairDifferences {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testcases; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(getBitDiffSum(arr, n));
            System.out.println(getBitDiffSumNSquareTC(arr));
        }

    }

    // O(n) Time Complexity
    static long getBitDiffSum(int[] arr, int n) {
        long total = 0;
        for (int i = 0; i < 32; i++) {
            int setBitCount = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) == 0)
                    setBitCount++;
            }
            total += (setBitCount * (n - setBitCount) * 2);
        }
        return total;
    }

    static long getBitDiffSumNSquareTC(int[] arr) {
        long count = 0;
        for (int j : arr) {
            for (int k : arr) {
                if (j == k) {
                    count += 0;
                } else if (map.containsKey(j + "_" + k)) {
                    count += map.get(j + "_" + k);
                } else {
                    int result = bitDifference(j, k);
                    map.put(j + "_" + k, result);
                    map.put(k + "_" + j, result);
                    count += result;
                }
            }
        }
        return count;
    }

    static int bitDifference(int a, int b) {
        int diffCount = 0;
        String bitA = Integer.toBinaryString(a);
        String bitB = Integer.toBinaryString(b);
        StringBuilder sb = new StringBuilder();
        if (bitA.length() > bitB.length()) {
            int diff = bitA.length() - bitB.length();
            for (int i = 0; i < diff; i++) {
                sb.append(0);
            }
            bitB = sb.append(bitB).toString();
        } else if (bitA.length() < bitB.length()) {
            int diff = bitB.length() - bitA.length();
            for (int i = 0; i < diff; i++) {
                sb.append(0);
            }
            bitA = sb.append(bitA).toString();
        }
        for (int i = 0; i < bitA.length(); i++) {
            if (bitA.charAt(i) != bitB.charAt(i))
                diffCount++;
        }
        return diffCount;
    }
}
