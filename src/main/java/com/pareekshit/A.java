package main.java.com.pareekshit;

public class A {
    public A() {
        System.out.print("A");
    }

    int add(int i, int j) {
        return i + j;
    }
}

class B extends A {
    public B() {
        super();
        System.out.print("B");
    }

    public static void main(String argv[]) {
        short s = 9;
        //System.out.println(add(s, 6));
    }
}

