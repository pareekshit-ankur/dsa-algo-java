package main.java.com.pareekshit.codingblocks.algorithms;

import java.util.Scanner;

public class StrangeRoads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        byte quadrant = 0;
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }
        int turns = (Math.abs(Math.min(x, y)) - 1) * 4 + quadrant;
        System.out.println(turns);
    }
}
