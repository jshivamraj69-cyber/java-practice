import java.util.Scanner;
public class GuessingGame {
   int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }
int guess(int guessNumber){
    return guessNumber - random;

}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GuessingGame game = new GuessingGame();
    System.out.println("Welcome to the guessing game.Guess the number between 1-100");
    int guess;
    int result;
    do { 
        
    System.out.print("Guess the number:");
    guess = input.nextInt();
    result = game.guess(guess);
    if (result == 0) {
        System.out.println("congrats, your guess is correct");
    } else if (result < 0) {
        System.out.println("Please Guess Higher");
    } else {
        System.out.println("please guess lower");
    }
    } while (result != 0);
}
}

