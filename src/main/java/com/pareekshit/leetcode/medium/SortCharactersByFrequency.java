package main.java.com.pareekshit.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Pair[] arr = new Pair[128];
        for (int i = 0; i < 128; i++) {
            char c = (char) i;
            arr[i] = new Pair(c, 0);
        }
        for (char c : s.toCharArray()) {
            Pair pair = arr[c];
            pair.setFreq(pair.getFreq() + 1);
            arr[c] = pair;
        }
        Arrays.sort(arr, Comparator.comparingInt(Pair::getFreq).reversed().thenComparing(Pair::getC));
        StringBuilder sb = new StringBuilder();
        for (Pair pair : arr) {
            if (pair.getFreq() > 0) {
                sb.append(String.valueOf(pair.getC()).repeat(Math.max(0, pair.getFreq())));
            }
        }
        return sb.toString();
    }

    class Pair {
        char c;
        int freq;

        public Pair(char c, int freq) {
            this.c = c;
            this.freq = freq;
        }

        public char getC() {
            return c;
        }

        public void setC(char c) {
            this.c = c;
        }

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }
    }
}
