import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter your current earth weight: ");
	int weight = keyboard.nextInt();
	double targetWeight = 0;
	System.out.print("\n");
	System.out.println("I have information for the following planets: ");
	System.out.println("\t1. Venus \t2.Mars \t3.Jupiter");
	System.out.println("\t4. Saturn \t5.Uranus \t6.Neptune");
	System.out.print("\n");
	System.out.print("Which planet are you visiting? ");
	int planet = keyboard.nextInt();
	System.out.print("\n");
	if (planet == 1) {
	targetWeight = weight * 0.78;
	}
	else if (planet == 2) {
	targetWeight = weight * 0.39;
	}
	else if (planet == 3) {
	targetWeight = weight * 2.65;
	}
	else if (planet == 4) {
	targetWeight = weight * 1.17;
	}
	else if (planet == 5) {
	targetWeight = weight * 1.05;
	}
	else if (planet == 6) {
	targetWeight = weight * 1.23;
	}
	System.out.println("Your weight would be " + targetWeight + " pounds on that planet.");
	}
}