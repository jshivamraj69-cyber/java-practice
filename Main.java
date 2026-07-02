import java.util.Scanner;
class PositiveNegativeZero {
    public static void main(string[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to number checker");
        System.out.println("Please enter a number");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("The number is positive");
        }
        else if (number < 0){
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
    