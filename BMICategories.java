import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	// System.out.print("Your height in m: ");
	// System.out.print("Your height in inches: ");
	System.out.print("Your height (feet only): ");
	// double heightInMetres = keyboard.nextDouble();
	// double heightInInches = keyboard.nextDouble();
	// double heightInMetres = heightInInches * 0.0254;
	double heightInFeetOnly = keyboard.nextDouble();
	System.out.print("Your height (inches): ");
	double inches = keyboard.nextDouble();
	double heightInMetres = ((heightInFeetOnly * 12) + inches) * 0.0254;
	// System.out.print("Your weight in kg: ");
	System.out.print("Your weight in pounds: ");
	// double weightInKg = keyboard.nextDouble();
	double weightInLbs = keyboard.nextDouble();
	double weightInKg = weightInLbs / 2.20462;
	System.out.print("\n");
	double bmi = (weightInKg / (heightInMetres * heightInMetres));
	System.out.printf("Your BMI is " + "%.6f", bmi);
	System.out.println();
	String bmiCategory = "";
	if (bmi < 18.5) {
		bmiCategory = "underweight";
	}
	else if(bmi >= 18.5 && bmi <= 24.9) {
		bmiCategory = "normal weight";
	}
	else if (bmi > 24.9 && bmi < 30) {
		bmiCategory = "overweight";
	}
	else if (bmi >= 30) {
		bmiCategory = "obese";
	}
	System.out.println("BMI Category: " + bmiCategory);
	}
}