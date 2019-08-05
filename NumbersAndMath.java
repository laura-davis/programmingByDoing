public class NumbersAndMath
{
	public static void main( String[] args )
	{
		// prints a string
		System.out.println( "I will now count my chickens:" );
		// prints a string concatenated with maths - division done first, so 30 divided by 6 = 5 then 5 added to 25 = 30
		System.out.println( "Hens " + (float)( 25 + 30 / 6 ));
		// prints a string concatenated with maths - think BODMAS! multiplication first so 25 times 3 = 75. 75 modulus 4 is the same as
		// saying the remainder of 75 divided by 4 (18), leaving 3.  then subtracting 3 from 100 = 97
		System.out.println( "Roosters " + (float)( 100 - 25 * 3 % 4 ) );
		// prints a string
		System.out.println( "Now I will count the eggs:" );
		// prints calculation. 4 modulus 2 = 0.  1 divided by 4 = 0.25 - prints as a string so rounded down to 0.  that leaves 3 + 2 + 1 = 6
		// plus 6 at the end = 12, take away 5 (BODMAS evaluates subtraction last), leaving 7
		System.out.println((float)( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 ));
		// prints a string
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		// prints a boolean - false, because 5 is more than -2
		System.out.println( 3 + 2 < 5 - 7 );
		// prints a string concatenated with a calculation - the output as above
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
		// prints a string	
		System.out.println( "Oh, that's why it's false." );
		// prints a string
		System.out.println( "How about some more." );
		// prints a string and boolean values - true (5 is more than -2), true (5 is greater than or equal to -2) and false (5 is not less
		// than or equal to -2)
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}