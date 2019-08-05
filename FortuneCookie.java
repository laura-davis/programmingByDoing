import java.util.Random;

public class FortuneCookie
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int number = 1 + r.nextInt(6);
        String fortune = "";


        if (number == 1)
        {
            fortune = "A beautiful, smart, and loving person will be coming into your life.";
        }
        else if (number == 2)
        {
            fortune = "A dubious friend may be an enemy in camouflage.";
        }
        else if (number == 3)
        {
            fortune = "A faithful friend is a strong defense.";
        }
        else if (number == 4)
        {
            fortune = "A feather in the hand is better than a bird in the air.";
        }
        else if (number == 5)
        {
            fortune = "A fresh start will put you on your way.";
        }
        else if (number == 6)
        {
            fortune = "A friend asks only for your time not your money.";
        }
        System.out.println("Fortune cookie says: \"" + fortune + "\"");

        System.out.println("\t" + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)) + " - " + (1 + r.nextInt(54)));
    }
}