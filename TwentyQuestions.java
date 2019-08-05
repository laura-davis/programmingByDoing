import java.util.Scanner;

public class TwentyQuestions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println();
        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        System.out.print("> ");
        String answer1 = keyboard.next();
        System.out.println();
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print("> ");
        String answer2 = keyboard.next();
        System.out.println();
        String guess = "";

        if (answer1.equals("animal"))
        {
            if(answer2.equals("no"))
            {
                guess = "squirrel";
            }
            else if (answer2.equals("yes"))
            {
                guess = "moose";
            }
        }
        else if (answer1.equals("vegetable"))
        {
            if(answer2.equals("no"))
            {
                guess = "carrot";
            }
            else if(answer2.equals("yes"))
            {
                guess = "watermelon";
            }
        }
        else if(answer1.equals("mineral"))
        {
            if(answer2.equals("no"))
            {
                guess = "paper clip";
            }
            else if(answer2.equals("yes"))
            {
                guess = "camaro";
            }
        }

        System.out.println("My guess is that you are thinking of a " + guess + ".");
        System.out.println("I would ask you if I'm right, but I don't actually care.");
    }
}