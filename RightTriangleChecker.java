import java.util.Scanner;

public class RightTriangleChecker
{
    public static void main(String[] args)
    {
        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        Scanner keyboard = new Scanner(System.in);
        int side1 = keyboard.nextInt();
        System.out.print("Side 2: ");
        int side2 = keyboard.nextInt();
        while (side1 > side2)
        {
            System.out.println(side2 + " is smaller than " + side1 + ".  Try again.");
            System.out.print("Side 2: ");
            side2 = keyboard.nextInt();
        }
        System.out.print("Side 3: ");
        int side3 = keyboard.nextInt();
        while (side2 > side3)
        {
            System.out.println(side3 + " is smaller than " + side2 + ".  Try again.");
            System.out.print("Side 3: ");
            side3 = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);
        if (((side1 * side1) + (side2 * side2)) == (side3 * side3))
        {
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        }
        else
        {
            System.out.println("NO!  These sides do not make a right triangle!");
        }
    }
}
