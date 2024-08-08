package main.java.com.pareekshit.codeforces;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfProblems = scanner.nextInt();
        int[][] matrix = new int[noOfProblems][3];
        int count, implementedProblems = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > 1) {
                implementedProblems++;
            }
        }
        System.out.println(implementedProblems);
    }
}
