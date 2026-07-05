
public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelIniters;
    int noOfSeats;

    public void start() {
        System.out.println("Car is starting");
    }

    public void drive() {
        if (currentFuelIniters > 0) {
            System.out.println("Car is driving");
        } else {
            System.out.println("Car cannot drive, fuel is empty");
        }
    }

    public void refuel(float fuel) {
        currentFuelIniters += fuel;
        System.out.println("Car refueled with " + fuel + " liters. Current fuel: " + currentFuelIniters + " liters.");
    }

    public void displayCarInfo() {
        System.out.println("Car Info:");
        System.out.println("Number of Wheels: " + noOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Current Fuel: " + currentFuelIniters + " liters");
        System.out.println("Number of Seats: " + noOfSeats);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.noOfWheels = 4;
        myCar.color = "Red";
        myCar.maxSpeed = 200.0f;
        myCar.currentFuelIniters = 10.0f;
        myCar.noOfSeats = 5;

        myCar.displayCarInfo();
        myCar.drive();
        myCar.refuel(5.0f);
        myCar.drive();
    }
}

