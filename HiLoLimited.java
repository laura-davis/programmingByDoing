import java.util.Random;
import java.util.Scanner;

public class HiLoLimited
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int numberOfGuesses = 7;
        int numberToGuess = (1 + r.nextInt(100));
        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        System.out.print("First guess: ");
        int guess = keyboard.nextInt();
        int guessNumber = 1;

        while(guess != numberToGuess && guessNumber < numberOfGuesses)
        {
            if (guess < numberToGuess)
            {
                System.out.println("Sorry, you are too low.");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("Sorry, you are too high.");
            }
            guessNumber++;
            System.out.print("Guess # " + guessNumber + ": ");
            guess = keyboard.nextInt();

        }
        if (guess == numberToGuess)
        {
            System.out.println("You guessed it!  What are the odds?!?");
        }
        if(guessNumber == numberOfGuesses)
        {
            System.out.println("Sorry you didn't guess it in " + numberOfGuesses + " tries.  The correct number was " + numberToGuess + ".  You lose.");
        }
    }
}