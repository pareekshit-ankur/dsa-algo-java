package main.java.com.pareekshit.inheritance;

public class TestIntehitance {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.eats();
        pigeon.eatsAbs();
        System.out.println(pigeon.canFly());
        System.out.println(pigeon.canFlyAbs());
        Parent parent = new Child();
        System.out.println(parent.i);
    }
}
