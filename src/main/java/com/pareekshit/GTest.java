package main.java.com.pareekshit;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int max = 0, secondMax = 0;
        int lastElement = 0;
        for (int i = 0; i < testCases; i++) {
            int size = scanner.nextInt();
            scanner.skip("\n");
            String s = scanner.nextLine();
            int[] array = Arrays.stream(s.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;
            for (int j = 0; j < size - 1; j++) {
                if (array[j + 1] > array[j] && array[j] > lastElement) {
                    count++;
                    lastElement = array[j];
                } else {
                    //if (count > 0) count = count + 1;
                    if (count > max) {
                        max = count;
                        count = 0;
                    } else if (count >= secondMax && count < max) {
                        secondMax = count;
                        count = 0;
                    }
                }
            }
            //if (count > 0) count = count + 1;
            if (count > max) {
                max = count;
                count = 0;
            } else if (count >= secondMax && count < max) {
                secondMax = count;
                count = 0;
            }
            System.out.println(max + secondMax);
        }

    }
}

class MyOuterClass {
    static Pattern pattern = Pattern.compile("");
    private int x = 1;
    private String st = "Number";

    public void innerInstance() {
        MyInnerClass inner = new MyInnerClass();
        inner.seeOuter(); /**Line A**/
    }

    public static void main(String args[]) {

        MyOuterClass obj = new MyOuterClass();
        obj.innerInstance();
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();
        map.put(1, "Amit");
        map.put(02, "Ravi");
        map.put(3, "Vijay");
        map.put(4, "Rahul");

        System.out.println(map.getOrDefault(2, "Not-Found") + " ");
        System.out.println(map.getOrDefault(5, "Not-Found"));

        System.out.println("saurabh&".replaceAll("$|&|#|", ""));
        System.out.println("vi#ve$k".replaceAll(pattern.toString(), ""));
        System.out.println("vi#ve$k".replaceAll("\\$", ""));
    }

    private class MyInnerClass /**Line B**/
    {
        private void seeOuter() {
            System.out.println(st + " " + x);
        }
    }
}