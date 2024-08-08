package main.java.com.pareekshit.shray;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        System.out.print("Enter Your Weight: ");

        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();

        System.out.print("Enter Your Height: ");
        double height = sc.nextDouble();

        double BMI = weight / height;
        System.out.println("Your BMI is : " + BMI);
        //bmi,weight and height
//bmi 18-25
        if (BMI > 25) {
            System.out.println("You are overweight");

        } else if (BMI >= 18 && BMI <= 25) {

            System.out.println("Your weight is good!");

        } else {
            System.out.println("Your weight is perfect!!!");
        }

    }
}
