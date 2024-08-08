package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AirtelPaymentsBank {

    public static void main(String[] args) {
        Integer[][] input = {{1, 2}, {3, 7}, {2, 5}, {10, 11}, {14, 15}};
        List<Integer[]> mergedList = new ArrayList<>();
        Comparator<Integer[]> comparator = Comparator.comparingInt(o -> o[0]);
        Arrays.sort(input, comparator);
        int count = 0;
        for (Integer[] value : input) {
            Integer[] a;
            if (!mergedList.isEmpty()) {
                a = mergedList.get(count);
                if (mergedList.get(count)[1] >= value[0] && mergedList.get(count)[1] < value[1]) {
                    a[0] = mergedList.get(0)[0];
                    a[1] = value[1];
                    mergedList.remove(count);
                    mergedList.add(count, a);
                } else if (mergedList.get(count)[1] >= value[0]
                        && mergedList.get(count)[1] > value[1]) {
                    a[0] = mergedList.get(count)[0];
                    a[1] = mergedList.get(count)[1];
                    mergedList.remove(count);
                    mergedList.add(count, a);
                } else {
                    a = value;
                    count++;
                    mergedList.add(count, a);
                }
            } else {
                a = value;
                mergedList.add(a);
            }

        }
        mergedList.forEach(integers -> System.out.println(Arrays.toString(integers)));

        String s1 = "abc";
        String s2 = "defg";
        System.out.println(s1);
        System.out.println(s2);
        s1 = s1 + s2;
        System.out.println(s1);
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);

        String s = "aabba";
        int c = 0;
        char previousChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == previousChar) {
                c++;
            } else {
                System.out.print(previousChar + "" + c);
                previousChar = s.charAt(i);
                c = 1;
            }
        }
        System.out.print(previousChar + "" + c);
    }
}
