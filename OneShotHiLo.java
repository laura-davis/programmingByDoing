import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        System.out.print("> ");
        int guess = keyboard.nextInt();
        System.out.println();
        int numberToGuess = (1 + r.nextInt(100));
        if (guess == numberToGuess)
        {
            System.out.println("You guess it!  What are the odds?!?");
        }
            else if (guess < numberToGuess)
            {
                System.out.println("Sorry, you are too low.  I was thinking of " + numberToGuess + ".");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("Sorry, you are too high.  I was thinking of " + numberToGuess + ".");
            }
        }
}