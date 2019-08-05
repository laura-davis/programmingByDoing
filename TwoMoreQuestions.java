import java.util.Scanner;

public class TwoMoreQuestions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        String answer1 = keyboard.next();
        System.out.print("Question 2) Is a living thing? ");
        String answer2 = keyboard.next();
        System.out.println();

        if((answer1.equals("inside")) && (answer2.equals("yes")))
        {
            System.out.println("Then what else could you be thinking of besides a houseplant?!");
        }
        if((answer1.equals("inside")) && (answer2.equals("no")))
        {
            System.out.println("Then what else could you be thinking of besides a shower curtain?!");
        }
        if((answer1.equals("outside")) && (answer2.equals("yes")))
        {
            System.out.println("Of course it's a bison?!");
        }
        if((answer1.equals("outside")) && (answer2.equals("no")))
        {
            System.out.println("Of course it's a billboard?!");
        }
        if((answer1.equals("both")) && (answer2.equals("yes"))) {
        	System.out.println("Obviously, the thing on your mind is a dog?!");
        }
        if((answer1.equals("both")) && (answer2.equals("no"))) {
        	System.out.println("Obviously, the thing on your mind is a cell phone?!");
        }
    }
}
