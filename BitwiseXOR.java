import java.util.Scanner;
class BitwiseXOR {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Showing Bitwise XOR operator\n");
   System.out.print("Please Enter the first number: ");   
   int first = input.nextInt();
    System.out.print("Please Enter the other number: ");
    int second = input.nextInt();
    int result = first ^ second;
    System.out.println("The result is:" + result);
}

}
// first we take two numbers as input from the user and then we apply the bitwise XOR operator (^) on those two numbers and store the result in a variable called result. Finally, we print the result to the console.
/* This is a simple program to demonstrate the bitwise XOR operator in Java
*/
