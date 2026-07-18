public class InheritanceTest {
    static class Vehicle {
        String brand = "Toyota";

        void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    static class Car extends Vehicle {
        String model = "Corolla";

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.display();
    }
}
