package main.java.com.pareekshit.problemsolving;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        FibonacciSeries.printFibonacci(7);
        System.out.println();
        System.out.println(FibonacciSeries.printFibonacciR(7));
        System.out.println();
        System.out.print(n1 + " " + n2);
        FibonacciSeries.printFibonacciR1(5);
    }

    // 0, 1, 1, 2, 3, 5, 8,
    public static void printFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static int printFibonacciR(int n) {
        if (n <= 1) {
            return n;
        } else {
            return printFibonacciR(n - 1) + printFibonacciR(n - 2);
        }
    }

    public static void printFibonacciR1(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacciR1(n - 1);
        }
    }
}




