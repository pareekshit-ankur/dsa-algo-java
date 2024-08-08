package main.java.com.pareekshit;

public class TestCar {

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("Maruti", "Red", 10000.00, true);
        Car car2 = new Car("Suzuki", "Yellow", 20000.00, false);
        System.out.println("Car:-> " + car);
        System.out.println("Car1:->" + car1);
        System.out.println("Car2:->" + car2);
        car.drive();

    }
}
