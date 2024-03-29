import java.util.Scanner;
public class PinLockout
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maximumTries = 5;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while (entry != pin && tries < maximumTries)
        {
            System.out.println("\nINCORRECT PIN.  TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if (entry == pin)
        {
            System.out.println("\nPIN ACCEPTED.  YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }
        else if (tries >= maximumTries)
        {
            System.out.println("\nYOU HAVE RUN OUT OF TRIES.  ACCOUNT LOCKED AFTER " + maximumTries + " ATTEMPTS.");
        }
    }
}

