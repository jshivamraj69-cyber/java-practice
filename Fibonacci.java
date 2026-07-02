import java.util.Scanner;

 class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Enter the number of terms you want to print: ");
        int terms = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        input.close();
    }
}