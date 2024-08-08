package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Input: new int[] {5, 2, 3, 4, 5}
 * Output: 1
 * Input: new int[] {3, 2, 1, 0, 4, 1, 0}
 * Output: 4
 */
class T {

    public static int FoodDistribution(int[] arr) {
        // code goes here
        int sandwiches = arr[0];
        ArrayList<Integer>[] al = new ArrayList[6];
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = 0;
            if (arr[i] > arr[i + 1]) {
                diff = arr[i] - arr[i + 1];
                if (al[diff] == null) {
                    al[diff] = new ArrayList<>();
                    al[diff].add(i);
                } else {
                    al[diff].add(i);
                }
            } else if (arr[i] < arr[i + 1]) {
                diff = arr[i + 1] - arr[i];
                if (al[diff] == null) {
                    al[diff] = new ArrayList<>();
                    al[diff].add(i + 1);
                } else {
                    al[diff].add(i + 1);
                }
            } else {
                if (al[0] == null) {
                    al[0] = new ArrayList<>();
                    al[0].add(i);
                } else {
                    al[0].add(i);
                }
            }
        }
        for (int i = al.length - 1; i > 0; i--) {
            if (al[i] != null && al[i].size() == 0) {
                continue;
            } else {
                ArrayList<Integer> list = al[i];
                if (list != null) {
                    for (Integer num : list) {
                        int diff = arr[num] - (arr[num] - i);
                        if (diff <= sandwiches) {
                            arr[num] -= diff;
                            sandwiches -= diff;
                        } else {
                            arr[num] -= sandwiches;
                            sandwiches -= sandwiches;
                        }
                    }
                }
            }
        }
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count += arr[i] - arr[i + 1];
            } else if (arr[i] < arr[i + 1]) {
                count += arr[i + 1] - arr[i];
            } else {
                count += 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(FoodDistribution(new int[]{5, 2, 3, 4, 5}));
        System.out.println(FoodDistribution(new int[]{3, 2, 1, 0, 4, 1, 0}));
    }

}



