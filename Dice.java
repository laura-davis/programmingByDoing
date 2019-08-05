import java.util.Random;

public class DiceDoubles {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("HERE COMES THE DICE!");
		System.out.println();
		int firstRoll = (1 + r.nextInt(6));
		System.out.println("Roll #1: " + firstRoll);
		int secondRoll = (1 + r.nextInt(6));
		System.out.println("Roll #2: " + secondRoll);
		System.out.println("The total is " + (firstRoll + secondRoll) + "!");
	}
}