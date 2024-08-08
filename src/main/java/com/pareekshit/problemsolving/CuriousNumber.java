package main.java.com.pareekshit.problemsolving;

import java.util.ArrayList;
import java.util.List;

class CuriousNumber {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Write a loop here to print all curious numbers
        //between 1 and 1000
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Number " + i + " is curious: ->" + new CuriousNumber().isCurious(i));
        }
        /*System.out.println(new CuriousNumber().isCurious(145));
        System.out.println(new CuriousNumber().isCurious(30));*/
    }


    //Write a method to check if given number is a curious number.
//145 is a curious number, as 1! + 4! + 5! =
// 1 + 24 + 120 = 145. (same as given number 145)
// Hint - ! indicates factorial
// 5! = 5 * 4 * 3 * 2 * 1
// 10! = 10 * 9 * 8 * .....* 2 * 1
    boolean isCurious(int number) {
        List<Integer> digitsInNumber = new ArrayList<>();
        int n = number;
        while (n != 0) {
            int digit = n % 10;
            digitsInNumber.add(digit);
            n = n / 10;
        }
        long count = 0;
        for (Integer digit : digitsInNumber) {
            count += factorial(digit);
        }
        List<Long> digitsInFactorial = getDigitsInNumber(count);
        if (digitsInFactorial.size() != digitsInNumber.size()) return false;
        else {
            for (int i = 0; i < digitsInNumber.size(); i++) {
                if (digitsInNumber.get(i) != Math.toIntExact(digitsInFactorial.get(i))) return false;
            }
        }
        return true;
    }

    long factorial(int number) {
        long factorial = 1;
        if (number == 1 || number == 0) {
            return 1;
        } else {
            factorial = number * factorial(number - 1);
        }
        return factorial;
    }

    List<Long> getDigitsInNumber(long number) {
        List<Long> digitsInNumber = new ArrayList<>();
        long n = number;
        while (n != 0) {
            long digit = n % 10;
            digitsInNumber.add(digit);
            n = n / 10;
        }
        return digitsInNumber;
    }
}