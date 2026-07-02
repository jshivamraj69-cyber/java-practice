import java.util.Scanner;

class Fahrenheit{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to temperture converter");
        System.out.println("Enter your temperture in Fahrenheit");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5.0f/9.0f;
        System.out.println("Your temperture in Celsius is " + celsius);
}
}