package main.java.com.pareekshit.codeforces;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int xPositionOf1 = 0, yPositionOf1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    xPositionOf1 = i;
                    yPositionOf1 = j;
                }
            }
        }
        System.out.println(Math.abs(2 - xPositionOf1) + Math.abs(2 - yPositionOf1));
    }
}
