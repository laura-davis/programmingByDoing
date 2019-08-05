import java.util.Scanner;

public class CollatzSequence
{
    public static void main(String[] args)
    {
        System.out.print("Starting number: ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.print(n + "\t");
        int stepCount = 0;
        int largestNumber = n;
        while(n != 1)
        {
            if ( n % 2 == 0)
            {
                n = n / 2;
                System.out.print(n + "\t");
                stepCount++;
            }
            else if (n % 2 != 0)
            {
                n = ((n * 3) + 1);
                System.out.print(n + "\t");
                stepCount++;
            }
            if(n > largestNumber)
            {
                largestNumber = n;
            }
        }
        System.out.println();
        System.out.println("Terminated after " + stepCount + " steps.");
        System.out.println("The largest number was " + largestNumber + ".");
    }
}