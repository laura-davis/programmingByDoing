import java.util.Scanner;

public class MoreUserInputOfData {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please enter the following information so I can sell it for a profit!");
	System.out.print("\n");

	System.out.print("First name: ");
	String firstName = keyboard.next();
	System.out.print("Last name: ");
	String lastName = keyboard.next();
	System.out.print("Grade (9 - 12): ");
	int grade = keyboard.nextInt();
	System.out.print("Student ID: ");
	long studentId = keyboard.nextLong();
	System.out.print("Login: ");
	String login = keyboard.next();
	System.out.print("GPA (0.0 - 4.0): ");
	double gpa = keyboard.nextDouble();
	System.out.print("\n");

	System.out.println("Your information:");
	System.out.println("\tLogin:\t" + login);
	System.out.println("\tID:\t" + studentId);
	System.out.println("\tName:\t" + lastName + ", " + firstName);
	System.out.println("\tGPA:\t" + gpa);
	System.out.println("\tGrade:\t" + grade);
	}
}