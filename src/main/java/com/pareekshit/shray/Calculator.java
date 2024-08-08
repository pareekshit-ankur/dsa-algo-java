package main.java.com.pareekshit.shray;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
/*

      SIR
      Do you know how to built

      Calculator?
        Projects
       Assignments
      Tests


      Material used to build Calculator in java:-

      1.Scanner

    Syntax:-  Scanner var= new Scanner(System.in);

      2.Operators
      3. PRINT
      4. Logic



 */

        System.out.print("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int no2 = sc.nextInt();

        int sum = no1 + no2;
        int sub = no1 - no2;
        int multiply = no1 * no2;
        int divide = no1 / no2;
        /*
        add:-

        12
        3
        12+3=15
         */

        System.out.println("Your sum is: " + sum);
        System.out.println("Your difference is: " + sub);
        System.out.println("Your product is: " + multiply);
        System.out.println("Your Quotient is: " + divide);
    }
}
