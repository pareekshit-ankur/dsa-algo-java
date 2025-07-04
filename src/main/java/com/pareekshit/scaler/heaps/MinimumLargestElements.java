package main.java.com.pareekshit.scaler.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumLargestElements {
    public static void main(String[] args) {
        //System.out.println(solve(new int[]{1, 2, 3, 4}, 3));
        System.out.println(solve(new int[]{5, 1, 4, 2}, 5));
        System.out.println(solve(new int[]{4, 8}, 0));
        System.out.println(1/2);
    }

    /*public static int solve(int[] A, int B) {
        int[] state = A.clone();
        Queue<Pair> minHeap = new PriorityQueue<>(Comparator.comparingInt(value -> value.value));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            minHeap.add(new Pair(A[i] * 2, i));
            max = Math.max(max, A[i]);
        }
        int i = 0;
        while (i < B && !minHeap.isEmpty()) {
            Pair pair = minHeap.poll();
            state[pair.index] += A[pair.index];
            pair.value = state[pair.index] + A[pair.index];
            minHeap.add(pair);
            max = Math.max(max, state[pair.index]);
            i++;
        }
        return max;
    }

    static class Pair {
        int value;
        int index;

        Pair(int val, int i) {
            value = val;
            index = i;
        }
    }*/

    public static int solve(int[] A, int B) {
        Queue<Pair> minHeap = new PriorityQueue<>(Comparator.comparingInt(Pair::getVal));
        for(int i=0;i<A.length;i++){
            minHeap.add(new Pair(A[i], i));
        }
        for(int i=0;i<B;i++){
            Pair pair = minHeap.poll();
            int c = pair.getVal()+A[pair.getIndex()];
            minHeap.add(new Pair(c, pair.getIndex()));
        }
        int ans =0;
        while(minHeap.size()>0){
            ans = minHeap.poll().getVal();
        }
        return ans;
    }

    static class Pair {
        Integer val;
        Integer index;

        Pair(Integer v, Integer i){
            this.val = v;
            this.index = i;
        }
        public Integer getVal(){
            return val;
        }

        public Integer getIndex(){
            return index;
        }

    }

}
