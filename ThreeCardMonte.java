import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
    public static void main(String[] args)
    {
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays out three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println("\t ##  ##  ##");
        System.out.println("\t ##  ##  ##");
        System.out.println("\t 1   2   3");
        System.out.println();
        System.out.print("> ");
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        Random r = new Random();
        int ace = 1 + r.nextInt(3);
        System.out.println();
        if (guess == ace) {
        	System.out.println("You nailed it!  Fast Eddie reluctantly hands over your winnings, scowling.");
        	}else {
        		System.out.println("Ha!  Fast Eddie wins again!  The ace card was number " + ace + ".");
        	}
        	System.out.println();
        if (ace == 1)
        {
            System.out.println("\t  AA  ##  ##");
            System.out.println("\t  AA  ##  ##");
        }
        else if (ace == 2)
        {
            System.out.println("\t  ##  AA  ##");
            System.out.println("\t  ##  AA  ##");
        }
        else if (ace == 3)
        {
            System.out.println("\t  ##  ##  AA");
            System.out.println("\t  ##  ##  AA");
        }
        System.out.println("\t  1   2   3");
        System.out.println();

    }

}
