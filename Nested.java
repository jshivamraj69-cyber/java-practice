public class Nested {
    private static int noOfDoors = 4;

    private void repair() {
        Tire tire = new Tire();
        tire.inflate();
    }

    public static class Tire {
        private double width = 205.0;
        private double pressure = 32.0;
        private String material = "Rubber";

        public void inflate() {
            System.out.println("Tire inflated successfully.");
            noOfDoors = 4;
        }

        public void display() {
            System.out.println("Width: " + width);
            System.out.println("Pressure: " + pressure);
            System.out.println("Material: " + material);
        }
    }

    public static void main(String[] args) {
        Nested car = new Nested();
        car.repair();

        Tire tire = new Tire();
        tire.display();
    }
}
