import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int numberToBeGuessed = 1 + r.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        int usersGuess = keyboard.nextInt();
        System.out.println();
        if (usersGuess == numberToBeGuessed)
        {
            System.out.println("That's right!  My secret number was " + numberToBeGuessed + "!");
        }
        else
        {
            System.out.println("Sorry, but I was really thinking of " + numberToBeGuessed + ".");
        }

    }
}