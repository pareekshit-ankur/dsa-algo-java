package main.java.com.pareekshit;

public class Examps {

    public static void main(String aa[]) {
        Examp e = Examp.set();
        e.print();

    }
}

class Examp {

    private int a;

    private Examp() {
        this.a = 10;

    }

    public void print() {
        /*protected*/
        int a = 20;
        System.out.println(a);
    }

    protected static Examp set() {
        return new Examp();
    }

}