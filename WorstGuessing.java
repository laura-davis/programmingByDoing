import java.util.Scanner;

public class WorstGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println();
		System.out.print("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		int numberToBeGuessed = 3;
		int userGuess = keyboard.nextInt();
		System.out.println();
		if (userGuess == numberToBeGuessed) {
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + numberToBeGuessed + "!");
		}
		else {
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + numberToBeGuessed + "!");
		}
	}
}