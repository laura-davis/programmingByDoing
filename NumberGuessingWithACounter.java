import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int usersGuess = 0;
        int numberToBeGuessed = 1 + r.nextInt(10);
        System.out.println("I have chosen number between 1 and 10.  Try to guess it.");
        System.out.print("Your guess: ");
        usersGuess = keyboard.nextInt();
        int numberOfGuesses = 1;
        while (usersGuess != numberToBeGuessed)
        {
            System.out.println("That is incorrect.  Guess again.");
            System.out.print("Your guess: ");
            usersGuess = keyboard.nextInt();
            numberOfGuesses++;
        }
        System.out.println("That's right! You're a good guesser.");
        System.out.println("It only took you " + numberOfGuesses + " tries. ");
    }
}
