import java.util.Random;
import java.util.Scanner;

public class md16 {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        Random randomNumber = new Random();
        int maxNumber = 100;
        int minNumber = 1;
        int computerGuess;
        int userAnswer;

        System.out.println("Think of a number from " + minNumber + " to " + maxNumber + "\n");
        System.out.println("Enter '1' if the number you thought is smaller than computer's guess.");
        System.out.println("Enter '2' if the number you thought is bigger than computer's guess.");
        System.out.println("Enter '0' if the number you thought is the same as computer's guess.\n");

        do {
            computerGuess = randomNumber.nextInt(maxNumber - minNumber + 1) + minNumber;
            System.out.println("Is " + computerGuess + " the correct digit? ");

            userAnswer = keyboardInput.nextInt();

            if (userAnswer == 1) {
                maxNumber = computerGuess  - 1;

            }
            if (userAnswer == 2) {
                minNumber = computerGuess + 1;

            }
        } while (userAnswer != 0);
        {
            System.out.println("You are correct! The correct answer was: " + computerGuess);
        }
    }
}
