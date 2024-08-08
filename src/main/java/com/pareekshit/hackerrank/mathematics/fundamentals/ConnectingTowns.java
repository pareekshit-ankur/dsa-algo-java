package main.java.com.pareekshit.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

public class ConnectingTowns {/*
 * Complete the connectingTowns function below.
 */

    private static final Scanner scanner = new Scanner(System.in);

    static int connectingTowns(int n, int[] routes) {
        /*
         * Write your code here.
         */
        long ways = 1;
        for (int i = 0; i < routes.length; i++) {
            ways = (ways % 1234567) * (routes[i] % 1234567);
        }
        return (int) (ways % 1234567);
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int[] routes = new int[n - 1];

            String[] routesItems = scanner.nextLine().split(" ");

            for (int routesItr = 0; routesItr < n - 1; routesItr++) {
                int routesItem = Integer.parseInt(routesItems[routesItr].trim());
                routes[routesItr] = routesItem;
            }

            int result = connectingTowns(n, routes);

            System.out.println(result);
        }

    }
}
