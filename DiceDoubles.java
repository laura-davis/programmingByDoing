import java.util.Random;

public class DiceDoubles
{
    public static void main(String[] args)
    {
        Random r = new Random();
        System.out.println("HERE COMES THE DICE!");
        System.out.println();
        int firstRoll = (1 + r.nextInt(6));
        int secondRoll = (1 + r.nextInt(6));
        System.out.println("Roll #1: " + firstRoll);
        System.out.println("Roll #2: " + secondRoll);
        System.out.println("The total is " + (firstRoll + secondRoll) + "!");
        while(firstRoll != secondRoll)
        {
            System.out.println();
            firstRoll = (1 + r.nextInt(6));
            secondRoll = (1 + r.nextInt(6));
            System.out.println("Roll #1: " + firstRoll);
            System.out.println("Roll #2: " + secondRoll);
            System.out.println("The total is " + (firstRoll + secondRoll) + "!");
        }
    }
}
