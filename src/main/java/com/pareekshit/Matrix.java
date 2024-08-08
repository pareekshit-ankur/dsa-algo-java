package main.java.com.pareekshit;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int a = 4, b = 5;
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = 0; j <= i; j++) {
                array[j][i] = b;
                b++;
            }
            for (j = j - 1; j >= 0; j--) {
                if (array[i][j] == 0) {
                    array[i][j] = b;
                    b++;
                }
            }
        }
        for (int[] ar : array) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
