import java.util.Scanner;

class FahrenheitToCelsius{
    public static void main(String args[]){
        Scannerinput = new Scanner(System.in);
        System.out.println("Welcome to temperture converter");
        System.out.prntln("Enter your temperture in Fahrenheit");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Your temperture in Celsius is " + celsius);
}
}