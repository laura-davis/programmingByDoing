import java.util.Scanner;

public class AddingValuesInALoop
{
    public static void main(String[] args)
    {
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        Scanner keyboard = new Scanner(System.in);
        int count = keyboard.nextInt();
        int total = 0;
        while (count != 0) {
        	total += count;
        	System.out.println("The number so far is " + total);
        	System.out.print("Number: ");
        	count = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("The total is " + total);
    }
}