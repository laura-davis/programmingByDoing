import java.util.Scanner;

public class HowOldAreYou2 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
	String name = keyboard.next();
	System.out.print("Ok, " + name + ", how old are you? ");
	int age = keyboard.nextInt();
	System.out.print("\n");
	if (age < 16) {
	System.out.println("You can't drive, " + name + ".");
	}
	else if (age >= 16 && age <= 17) {
	System.out.println("You can drive but not vote, " + name + ".");
	}
	else if (age >= 18 && age <= 24) {
	System.out.println("You can vote but not rent a car, " + name + ".");
	}
	else {
	System.out.println("You can do pretty much anything, " + name + ".");
	}
	}
}