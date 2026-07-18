public class AccessTest {
    public static void main(String[] args){
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        Car newCar = new Car();
        newCar.color = "Black";
        newCar.model = "BMW";
        newCar.fuelLevel = 1;
        newCar.costOfPurchase = 5000000;
        System.out.println("New Car");
    }
}

class Car {
    String color;
    String model;
    int fuelLevel;
    int costOfPurchase;
}
