package main.java.com.pareekshit.codeforces.strings;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String result = scanner.nextLine();
        int antonWin = 0, dainikWin = 0;
        for (int i = 0; i < n; i++) {
            if (result.charAt(i) == 'A')
                antonWin++;
            else
                dainikWin++;
        }
        if (antonWin > dainikWin) {
            System.out.println("Anton");
        } else if (antonWin < dainikWin) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
