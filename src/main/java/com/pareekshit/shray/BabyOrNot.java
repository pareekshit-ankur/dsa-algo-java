package main.java.com.pareekshit.shray;

import java.util.Scanner;

public class BabyOrNot {
    public static void main(String[] args) {

        System.out.print("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are an Adult");
                break;

            case 2:
                System.out.println("You are a baby");
                break;


            case 100:
                System.out.println("You already dead!!!! ");
            default:
                System.out.println("Enjoy!!!!!!!!!!!");
                break;
        }
        System.out.println("Thanks for using my invention");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Rate it : ");
        String rate = sc2.nextLine();
        System.out.println("Thanks for your feedback!!!");


    }
}
