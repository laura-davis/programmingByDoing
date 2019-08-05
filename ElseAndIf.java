public class ElseAndIf {
	public static void main (String[] args) {
	int people = 30;
	int cars = 40;
	int buses = 15;

	if (cars > people) {
	System.out.println("We should take the cars."); 
	}
	else if (cars < people) {
	System.out.println("We should not take the cars.");
	}
	else {
	System.out.println("We can't decide");
	}

	if (buses > cars) {
	System.out.println("That's too many buses.");
	}
	else if (buses < cars) {
	System.out.println("Maybe we could take the buses.");
	}
	else {
	System.out.println("We still can't decide");
	}

	if (people > buses) {
	System.out.println("All right, let's just take the buses.");
	}
	else {
	System.out.println("Fine, let's stay home then.");
	}
	}
}

// if and else if / else are providing different outcomes based on the value 
// of the boolean i.e., if this is true, do this - else, evaluate this - 
// if this is true, do this.. and if not, execute whatever is in the curly
// braces for the final else statement

// removing the "else" makes no difference in this case - this is evaluated 
// on its own merits as an "if" statement, as the first if condition is false
// anyway