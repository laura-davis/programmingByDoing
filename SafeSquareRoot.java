import java.util.Scanner;
// import java.Math;

public class SafeSquareRoot {
	public static void main(String[] args) {
	System.out.println("SQUARE ROOT!");
	System.out.print("Enter a number: ");
	Scanner keyboard = new Scanner(System.in);
	int input = keyboard.nextInt();
	while (input < 0) {
		System.out.println("You can't take the square root of a negative number, silly.");
		System.out.print("Try again: ");
		input = keyboard.nextInt();
	}
	double squareRoot = Math.sqrt(input); 
		System.out.println("The square root of " + input + " is " + squareRoot + ".");
	
	}
}