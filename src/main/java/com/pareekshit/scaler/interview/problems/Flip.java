package main.java.com.pareekshit.scaler.interview.problems;

import main.java.com.pareekshit.Util;

public class Flip {
    public static void main(String[] args) {
        Util.printArray(flip("111000"));
        Util.printArray(flip("111011101"));
    }

    public static int[] flip(String A) {
        int count = 0;
        int N = A.length();
        int L = 0, R = 0;
        int start_index_of_substr;
        int[] empty_array = {};
        int[] ans_array = new int[2];
        int count_of_0 = 0;
        int Curr_count = 0;
        int Max_count = Integer.MIN_VALUE;
        for (char c : A.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        if (count == A.length()) {
            return new int[]{};
        }
        if (count == 0) {
            return new int[]{1, A.length()};
        }

        start_index_of_substr = 0; //Initially consider start of the substring index = 0
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') //Increase the count when 0 encounters; since we want maximum 0's in substring
                Curr_count += 1;
            else if (A.charAt(i) == '1') //decrease the count when 1 comes; since we want minimum 1's in substring
                Curr_count -= 1;
            if (Curr_count > Max_count) {
                Max_count = Curr_count;
                L = start_index_of_substr;
                R = i; //since, when u stand at i that is the rightmost end
            }
            if (Curr_count < 0) { //meaning number of 1's are more than 0's in the present substring
                Curr_count = 0; // reset the Curr_count to 0 and start fresh substring
                start_index_of_substr = i + 1; // consider a new substring and restart
            }
        }
        /*  Our current L and R are good answer -> but they are good for 0 based indexing
            Since, According to question L and R are 1 based indexing
            so, we add 1 in both L and R */
        ans_array[0] = L + 1;
        ans_array[1] = R + 1;
        return ans_array;
    }
}
