package main.java.com.pareekshit.hackerrank.datastructures;

import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i;
        for (i = 0; i + leap < game.length; ) {
            if (game[i + 1] != 0 && game[i + leap] != 0) {
                return false;
            } else if (game[i + leap] == 0) {
                i += leap;
            } else if (game[i + 1] == 0) {
                i += 1;
            }
        }
        return i + leap >= game.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
