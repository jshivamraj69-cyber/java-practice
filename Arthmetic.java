import java.util.Scanner;
class Arithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic calculator\n");
        System.out.print(" Please enter the first number: ");
        int first = input.nextInt();
        System.out.print(" Please enter the second number: ");
        int second = input.nextInt();
        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        if (second != 0) {
            int div = first / second;
            int mod = first % second;
            System.out.println("Division is: " + div);
            System.out.println("Modulus is: " + mod);
        } else {
            System.out.println("Division: undefined (division by zero)");
            System.out.println("Modulus: undefined (division by zero)");
        }
        input.close();
    }
}