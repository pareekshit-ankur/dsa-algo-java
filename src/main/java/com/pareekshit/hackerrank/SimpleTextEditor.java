package main.java.com.pareekshit.hackerrank;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    static String text = "";
    static Stack<String> stack = new Stack<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < tests; i++) {
            String s = scanner.nextLine();
            String[] options = s.split(" ");
            int option = Integer.parseInt(options[0].trim());
            switch (option) {
                case 1:
                    append(options[1]);
                    break;
                case 2:
                    delete(Integer.parseInt(options[1].trim()));
                    break;
                case 3:
                    print(Integer.parseInt(options[1].trim()));
                    break;
                case 4:
                    undo();
                    break;
            }
        }
    }

    public static void append(String s) {
        text = text.concat(s);
        stack.push(text);
    }

    public static void delete(int k) {
        text = text.substring(0, text.length() - k);
        stack.push(text);
    }

    public static void print(int k) {
        System.out.println(text.charAt(k - 1));
    }

    public static void undo() {
        if (!stack.empty()) {
            stack.pop();
            try {
                text = stack.peek();
            } catch (EmptyStackException e) {
                text = "";
            }
        }
    }

}
