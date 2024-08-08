package main.java.com.pareekshit;

import main.java.com.pareekshit.inheritance.Child;
import main.java.com.pareekshit.inheritance.Parent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Child child = new Child();
        child.m1();
        Parent parent = new Parent();
        parent.m1();
        Parent parent1 = new Child();
        parent1.m1();


        Child child1 = new Child();
        child1.m2();
        Parent parent2 = new Parent();
        parent2.m2();
        Parent parent3 = new Child();
        parent3.m2();


        Child child2 = new Child();
        child2.m3();
        Parent parent4 = new Parent();
        //parent4.m3(); Compile time error for method declared protected
        Parent parent5 = new Child();
        //parent5.m3();

        //swap(3, 7);

        try {
            Float f = new Float("3.0");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException e) {
            System.out.println("bad number");
        }

        try {
            int c = 1 / 0;
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
        new B1();


        ArrayList<String> list = new ArrayList<>();
        list.add("22, Rajan Anand, Engineering, 1600000");
        list.add("23, Swati Patil, Testing, 800000");
        list.add("27, Vijay Chawda, Engineering, 800000");
        list.add("29, Basant Mahapatra, Engineering, 600000");
        list.add("32, Ajay Patel, Testing, 350000");
        list.add("34, Swaraj Birla, Testing, 350000");
        System.out.println(processData(list));

    }


    public static void swap(int a, int b) {
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
        System.out.println("After Swapping");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
    }

    public static Map<String, Integer> processData(ArrayList<String> array) {
        /*
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        Map<String, Integer> retVal = new HashMap<>();
        TreeMap<Integer, Integer> engineering = new TreeMap<>();
        TreeMap<Integer, Integer> testing = new TreeMap<>();
        for (String s : array) {
            String[] arr = s.split(",");
            if (arr[2].trim().equalsIgnoreCase("testing")) {
                testing.putIfAbsent(Integer.parseInt(arr[0].trim()), Integer.parseInt(arr[3].trim()));
            } else if (arr[2].trim().equalsIgnoreCase("Engineering")) {
                engineering.putIfAbsent(Integer.parseInt(arr[0].trim()), Integer.parseInt(arr[3].trim()));
            }

        }
        retVal.put("Testing", testing.get(testing.lastKey()));
        retVal.put("Engineering", engineering.get(engineering.lastKey()));
        return retVal;
    }
}
