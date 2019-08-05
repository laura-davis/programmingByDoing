import java.util.Scanner;

public class LittleQuiz {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int score = 0;
	System.out.print("Are you ready for a quiz?  Press Y or N. ");
	char yesOrNo = keyboard.next().charAt(0);
	if (yesOrNo == 'N') {
	System.out.println("Okay, come back if you want to play!");
}
	else if (yesOrNo == 'Y') {
	System.out.println("Okay, here it comes!");
	}
	else {
	System.out.println("You must enter Y or N.");
	}
	System.out.print("\n");
	System.out.println("Q1) What is the capital of Alaska?");
	System.out.println("\t1) Melbourne");
	System.out.println("\t2) Anchorage");
	System.out.println("\t3) Juneau");
		System.out.print("\n");
	int answer1 = keyboard.nextInt();
		System.out.print("\n");
	if(answer1 == 3) {
		System.out.println("That's right!");
		score +=1;
	}
	else {
		System.out.println("Sorry, the correct answer is 3) Juneau.");
	}
	System.out.print("\n");
	System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
	System.out.println("\t1) Yes");
	System.out.println("\t2) No");
	System.out.print("\n");
	int answer2 = keyboard.nextInt();
	System.out.println();
	if(answer2 == 2) {
		System.out.println("Well done!");
		score += 1;
	}
	else {
		System.out.println("Sorry, \"cat\" is a String.  Ints can only store numbers");
	}
	System.out.println();
	System.out.println("Q3) What is the result of 9+6/3?");
	System.out.println("\t1) 5");
	System.out.println("\t2) 11");
	System.out.println("\t3) 15/3");
	System.out.println();
	int answer3 = keyboard.nextInt();
	System.out.println();
	if (answer3 == 2) {
		System.out.println("That's correct!");
		score += 1;
	}
	else {
		System.out.println("Oops that's not right.");
	}
	System.out.println();
	System.out.println("Overall you got " + score + " out of 3 correct.");
	System.out.println("Thanks for playing!");
	}
	}
	