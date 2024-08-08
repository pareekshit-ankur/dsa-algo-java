package main.java.com.pareekshit;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

interface StrFunc {
    String disp(String n);
}

public class HackerEarth {
    private static int $;

    public static void main(String args[]) {
        HackerEarth var = new HackerEarth();
        System.out.println("Main Block:" + var.getValue());

        StrFunc output = (str) -> {
            String result = "";
            int a;
            for (a = str.length() - 1; a >= 0; a--)
                result += str.charAt(a);
            return result;
        };

        System.out.println(output.disp("HACKEREARTH"));

        Hint hint = Person.class.getAnnotation(Hint.class);
        System.out.println(hint);
        Hints hints1 = Person.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length);
        Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);

        String h_e = "";
        System.out.print($);
        System.out.print(h_e);

        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);

        Hacker obj = new Hacker();
        Thread t = new Thread(obj, "Java");
        Thread t1 = new Thread(obj, "PHP");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        System.out.println();
        /*StringBuilder b = "hacker";
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);*/

        String regex = ".@.";

        HackerEarth.compare("Hacker@Earth.com", regex);
        HackerEarth.compare("a@N", regex);
        HackerEarth.compare("Java@Program", regex);


        A2 obj1 = new A2();

        obj1.cal(2, 3);

        System.out.println(obj1.x + " " + obj1.y);

    }

    public static void compare(String str, String regex) {
        if (str.matches(regex)) {
            System.out.println(str + " matches");
        } else {
            System.out.println(str + " does not match");
        }
    }

    int getValue() {
        int returnValue = 10;
        try {
            String[] Languages = {"Java", "Ruby"};
            System.out.println(Languages[5]);
        } catch (Exception e) {
            System.out.println("Catch Block :" + returnValue);
            return returnValue;
        } finally {
            returnValue += 10;
            System.out.println("Finally Block :" + returnValue);
        }
        return returnValue;
    }

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @interface MyAnnotation {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Hints {
        Hint[] value();
    }

    @Repeatable(Hints.class)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Hint {
        String value();
    }

    @Hint("hint1")
    @Hint("hint2")
    class Person {
    }
}

class A2 {

    public int x;

    protected int y;

    void cal(int a, int b) {

        x = a + 1;

        y = b;

    }

}