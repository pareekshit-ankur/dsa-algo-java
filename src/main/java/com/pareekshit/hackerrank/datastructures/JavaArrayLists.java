package main.java.com.pareekshit.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaArrayLists {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s;
        for (int i = 0; i < tests; i++) {
            s = scanner.nextLine();
            String[] options = s.split(" ");
            arrays.add(Arrays.stream(options).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
        }
        tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < tests; i++) {
            s = scanner.nextLine().trim();
            String[] options = s.split(" ");
            int x = Integer.parseInt(options[0].trim());
            int y = Integer.parseInt(options[1].trim());
            try {
                System.out.println(arrays.get(x - 1).get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
}
