package main.java.com.pareekshit;

public class Car {

    private String name; //member variable
    private String color;
    private double cost;
    private boolean isDriving;

    public Car() {
    }

    public Car(String name, String color, double cost, boolean isDriving) {
        this.name = name;
        this.color = color;
        this.cost = cost;
        this.isDriving = isDriving;
    }

    public void drive() { //member method or member function
        System.out.println("Car is driving");
    }

    public static void driveStatic() {

    }

    private static void driveStaticPrivate() {

    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", isDriving=" + isDriving +
                '}';
    }

    private class InnerPrivate {

    }

    public class InnerPublic {

    }

    protected class InnerProtected {

    }
}
