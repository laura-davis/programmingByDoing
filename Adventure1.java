import java.util.Scanner;

public class Adventure1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println();
        System.out.println("You are in a creepy house!  Would you like to go 'upstairs' or into the 'kitchen'?");
        System.out.print("> ");
        String answer1 = keyboard.next();
        System.out.println();

        if(answer1.equals("kitchen"))
        {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side");
            System.out.println("there is, as you'd expect, a refrigerator.  You may open the 'refrigerator'");
            System.out.println("or look in a 'cabinet'");
            System.out.print("> ");
            String answer2 = keyboard.next();
            if(answer2.equals("refrigerator"))
            {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.");
                System.out.println("Would you like to eat some of the food?  ('yes' or 'no)");
                System.out.print("> ");
                String answer3 = keyboard.next();
                if(answer3.equals("no"))
                {
                    System.out.println("You die of starvation...  eventually.");
                }
                else if (answer3.equals("yes"))
                {
                    System.out.println("You die from a vomiting bug.");
                }
            }
            else if(answer2.equals("cabinet"))
            {
                System.out.println("You open the cabinet and there is a spider inside.");
                System.out.println("Do you 'free' the spider or try to 'kill' it?");
                System.out.print("> ");
                String answer3 = keyboard.next();
                if(answer3.equals("free"))
                {
                    System.out.println("The spider says 'thanks'! And goes on his merry way");
                }
                else if(answer3.equals("kill"))
                {
                    System.out.println("The spider escapes! He grows to 10ft tall then treads on YOU!");
                }
            }
        }
        else if(answer1.equals("upstairs"))
        {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master");
            System.out.println("'bedroom'.  There is also a 'bathroom' off the hallway.  Where would you like");
            System.out.println("to go?");
            System.out.print("> ");
            String answer2 = keyboard.next();
            if(answer2.equals("bedroom"))
            {
                System.out.println("You are in a plush bedroom, complete with expensive-looking hardwood furniture.  The");
                System.out.println("bed is unmade.  In the back of the room, the closet door is ajar.  Would you");
                System.out.println("like to open the door? ('yes' or 'no')");
                System.out.print("> ");
                String answer3 = keyboard.next();
                if(answer3.equals("no"))
                {
                    System.out.println("Well then I guess you'll never know what was in there.  Thanks for playing,");
                    System.out.println("I'm tired of making nested if statements");
                }
                else if(answer3.equals("yes"))
                {
                    System.out.println("The closet is full of junk which topples out on top of you!");
                }
            }
            else if(answer2.equals("bathroom"))
            {
                System.out.println("You see something behind the shower curtain. Do you open it? ('yes' or 'no)");
                System.out.print("> ");
                String answer3 = keyboard.next();
                if(answer3.equals("yes"))
                {
                    System.out.println("A snake has somehow climbed through the plughole! Run!");
                }
                else if(answer3.equals("no")); {
                System.out.println("You pause... and after a few seconds the cat comes flying out from behind");
                System.out.println("the curtain - he must have got stuck!");
            }
        }
    }
}
}
