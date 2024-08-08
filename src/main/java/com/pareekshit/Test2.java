package main.java.com.pareekshit;

import java.math.BigInteger;
import java.util.*;

public class Test2 {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static class inner {
        private int getSum() {
            //return (temp1+temp2+temp3+temp4);
            return temp1;
        }
    }

    public static int temp1 = 1;
    static int val = 3;
    private static int temp2 = 2;

    static {
        int y = 7;
    }

    public int temp3 = 3;
    int x = 4;
    private int temp4 = 4;

    public Test2() {
        System.out.println("hello");
    }

    static int getValue() {
        return val--;
    }

    //Test test = new Test();
    public static void main(String[] args) {
        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total.add(fiveThousand);
        total.add(fiftyThousand);
        total.add(fiveHundredThousand);
        System.out.println(total);

        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: " + pig == dog);

        /*int count = 0;
        for (int i = START; i <= END; i++)
            count++;
        System.out.println(count);*/

        String ransomNote = "baaa";
        String magazine = "aabbbckjgio";

        System.out.println(ransomNoteAvailable(ransomNote, magazine));

        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(4.0);
        vals.add(16.0);
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.print(" " + n)))
            ;
        System.out.println();
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))))
            ;
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.print(" " + n));
        System.out.println();

        /*int n;
        for(int i=0; i < 5; i++)
        {
            n = getValue();
            assert n > 2;
            System.out.println(" " + n);
        }*/

        int temp = 40;
        if (temp == 30 && temp / 0 == 40) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        double data = 20.324;
        int sum = 6;
        float value = 5.1f;
        System.out.println(data + sum + value);
        Test test = new Test();
        System.out.println(1 * 2 + 3 ^ 4 / 5);

        foo(null);
        int goats[][] = new int[3][];
        goats[0] = new int[]{1, 2};
        int a = 260;
        byte b = (byte) a;
        System.out.println(b);

        ArrayList<String> obj = new ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D");
        for (String s : obj) {
            System.out.println(s);
        }
        System.out.println(1 >> 2);
        System.out.println(1 << 2);
        System.out.println(1 & 2);

        Test.inner obj2 = new Test.inner();
        List<? extends Number> nums = new ArrayList<>();
        //nums.add(3.14);
        nums.add(null);

        List<? super Number> numSuper = new ArrayList<>();
        numSuper.add(3.14);
        numSuper.add(null);

        int x = 5;
        {
            int y = 6;
            System.out.println(x + " " + y);
        }
        long phoneNumber = 7009441141L;
        System.out.println(add(10, 50));
        System.out.println(add(10, 20));
        System.out.println(add(10, 30));
        System.out.println(add(10, 40));
        System.out.println(add(10, 10));
        long[] arr = new long[10];
        long max = Arrays.stream(arr).max().getAsLong();
        List<Long> arrList =
                new ArrayList<>();
        //Long m = Collections.max(arrList);

        int x1 = 10;
        int y1 = 10;
        //if else block
        if (x1 > y1) {
            System.out.println("x1 is greater than y1");
        } else {
            System.out.println("x1 is less than y1");
        }

        //if else if block
        if (x1 > y1) {
            System.out.println("x1 is greater than y1");
        } else if (x1 < y1) {
            System.out.println("x1 is less than y1");
        } else {
            System.out.println("x1 is equal to y1");
        }
        String s = "rbrb";
        String s1 = "lrbb";
        System.out.println(s.indexOf(s.charAt(0)));
        System.out.println(s.lastIndexOf(s.charAt(0)));

    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
        //return a+b; Both will work same.
    }

    public static void print() {
        System.out.println("Hello");
    }

    //public -> access modifier
    //static -> method belongs to the class not the object of the class
    // int -> data type which is returned from the method
    //add -> method name
    //(int a, int b) -> parameters passed to the method.
    //return -> this keyword returns the value from the method.

    /*public static <T> T max(T x, T y) {
        return x > y ? x : y;
    }*/

    public static void foo(Object impl) {
        System.out.println("Object Impl");
    }

    public static void foo(String impl) {
        System.out.println("String Impl");
    }

    public static boolean ransomNoteAvailable(String ransomNote, String magazine) {

        if (ransomNote.isEmpty() || ransomNote == null || magazine.isEmpty() || magazine == null) {
            return false;
        }

        Map<Character, Integer> magazineCount = new HashMap<Character, Integer>();
        for (int i = 0; i <= magazine.length() - 1; i++) {
            if (magazineCount.containsKey(magazine.charAt(i))) {
                magazineCount.put(magazine.charAt(i), magazineCount.get(magazine.charAt(i)) + 1);
            } else {
                magazineCount.put(magazine.charAt(i), 1);
            }
        }

        for (int i = 0; i <= ransomNote.length() - 1; i++) {
            if (magazineCount.containsKey(ransomNote.charAt(i))) {
                int count = magazineCount.get(ransomNote.charAt(i));
                magazineCount.put(ransomNote.charAt(i), --count);
                if (count == 0) {
                    magazineCount.remove(ransomNote.charAt(i));
                }
            } else {
                return false;
            }
        }
        return true;
    }


}


