
    
import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the factorial generator\n");
        System.out.print("please enter your number: ");
        int num =sc.nextInt();
        long fact = factorialIterative(num);
        System.out.println("factorial of your number is:"+fact);

    }
    public static long factorialIterative(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}

