import java.util.Scanner;
class LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM calculator");
        System.out.print("please enter your number:");
        int firstNumber = input.nextInt();
        System.out.print("please enter your second number:");
        int secondNumber = input.nextInt();
        int lcm = (firstNumber * secondNumber);
        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);
    }
    public static int lcm(int firstNumber, int secondNumber){
        int i = 1;
        while(i <= secondNumber ){
int factor = firstNumber * i;
if (factor % secondNumber == 0){
return factor;
        }
        i++;
    }
    return 0;
}
    
}
