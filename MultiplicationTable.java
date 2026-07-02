import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication World\n");
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
        scanner.close();
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
