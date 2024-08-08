package main.java.com.pareekshit.scaler.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class MishaAndCandies {
    public static void main(String[] args) {
        //System.out.println(solve(new int[]{3, 2, 3}, 4));
        //System.out.println(solve(new int[]{1, 2, 1}, 2));
        //System.out.println(solve(new int[]{705}, 895));
        //System.out.println(solve(new int[]{497, 937, 528, 417, 493, 76, 204, 473, 955, 542, 435, 583, 787, 497, 595, 596, 574, 256, 106, 391, 330, 362, 610, 751}, 289));
        System.out.println(solve(new int[]{406,682,42,265,387,280,98,844,209,767,357,799,356,911,922,208,749,515,0,778,679,665,402,52,435,551,648,145,125,504,237,836,137,806,45,103,919,871,248,54,386,982,986,262,638,919,844,128,784,640,672,692,202,682,756,48,111,318,817,24,537,268,684,801,787,480,694,420,227,287,944,275,821,806,939,872}, 122));
    }

    public static int solve(int[] A, int B) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i : A) {
            minHeap.add(i);
        }
        int count = 0;
        while (!minHeap.isEmpty() && minHeap.peek() <= B) {
            int candy = minHeap.poll();
            count += candy / 2;
            if (!minHeap.isEmpty()) {
                candy -= (candy / 2);
                candy += minHeap.poll();
                minHeap.add(candy);
            }
        }
        return count;
    }
}
