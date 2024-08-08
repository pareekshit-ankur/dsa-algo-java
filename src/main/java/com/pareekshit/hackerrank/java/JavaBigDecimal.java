package main.java.com.pareekshit.hackerrank.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Comparator<String> customComparator = (o1, o2) -> {
            if (o1 != null && o2 != null) {
                BigDecimal b1 = new BigDecimal(o1);
                BigDecimal b2 = new BigDecimal(o2);
                return b2.compareTo(b1);
            }
            return 0;
        };
        Arrays.sort(s, customComparator);
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
