import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        String gender = keyboard.next();
        System.out.print("First name: ");
        String firstName = keyboard.next();
        System.out.print("Last name: ");
        String lastName = keyboard.next();
        System.out.print("Age: ");
        int age = keyboard.nextInt();
        System.out.println();
        if (age < 20)
        {
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
        }
        else if (gender.equalsIgnoreCase("m") && age >= 20)
        {
            System.out.println("Then I shall call you Mr. " + lastName + ".");
        }
        else if(gender.equalsIgnoreCase("F") && age >= 20)
        {
            System.out.print("Are you married, " + firstName + " (Y or N?): ");
            String married = keyboard.next();
            System.out.println();
            if(married.equalsIgnoreCase("y"))
            {
                System.out.println("Then I shall call you Mrs. " + lastName + ".");
            }
            else System.out.println("Then I shall call you Ms. " + lastName + ".");

        }
    }

    }