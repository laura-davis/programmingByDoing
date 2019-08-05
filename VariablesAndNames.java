public class VariablesAndNames {
	public static void main(String[] args) {
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		// int
		cars = 100;
		// double - could be changed to an int if whole number only but would need to change declaration
		space_in_a_car = 4.0;
		// int
		drivers = 30;
		// int
		passengers = 90;
		// int = 100 - 30 = 70
		cars_not_driven = cars - drivers;
		// int = int = 30 = assigning same value
		cars_driven = drivers;
		// double - product of cars driven (30) * space in a car (4.0) - 120.0.  Could be an int but would need to change declaration
		// can't have 0.5 of a person!
		carpool_capacity = cars_driven * space_in_a_car;
		// double - calculated by dividing number of passengers by number of cars driven, i.e., 90 divided by 30, so 3 (again could be int)
		average_passengers_per_car = passengers / cars_driven;

		//float provides more accuracy vs. a double

		System.out.println("There are " + cars + " cars available.");
		System.out.println( "There are only " + drivers + " drivers available." );
		System.out.println( "There will be " + cars_not_driven + " empty cars today." );
		System.out.println( "We can transport " + carpool_capacity + " people today." );
		System.out.println( "We have " + passengers + " to carpool today." );
		System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );      	}
	}