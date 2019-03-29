package day1_20march_111099_fs;

public class NumbersAndMath {
//	public static void main(String[] args) {
//		// This line is printing out the statement
//		System.out.println("I will now count my chickens:");
//		// This line is printing out the string hens concatenated with the
//		// integers in the parenthesis.
//		// Following the order of operations,division is done before addition,
//		// so 30/6 is 5 added to 5 is 30.
//		System.out.println("Hens " + (25 + 30 / 6));
//		// string roosters concatenated with operations first 25 times 3 equals
//		// 75modululus4 which gives the remainder
//		// 75%4 gives you 3 and then you subtract 3 from 100 which gives you 97
//		System.out.println("Roosters " + (100 - 25 * 3 % 4));
//		// printed out statement
//		System.out.println("Now I will count the eggs:");
//		// string roosters concatenated with operations so 4%2 is 0. 6-5 + 0 -.5 +6 which
//		// equals 6.75, and is returned as an integer rounded up (7).
//		System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);
//		// prints statement
//		System.out.println("Is it true that 3 + 2 < 5 - 7?");
//		// evaluating by adding 3 +2 to get 5 and then subtracting 7 from 5 to
//		// get -2. so 5< -2 is false
//		System.out.println(3 + 2 < 5 - 7);
//		// printing out expression in strings and then performing operation of
//		// addition on integers 3 and 3 which return 5
//		System.out.println("What is 3 + 2? " + (3 + 2));
//		// printing out expression in strings and then performing operation of
//		// subtracting 7 from 5 and then returns -2.
//		System.out.println("What is 5 - 7? " + (5 - 7));
//		// prints statement
//		System.out.println("Oh, that's why it's false.");
//		// prints statement
//		System.out.println("How about some more.");
//		// prints expression and the comparison operater to check if 5 is
//		// greater than -2 which then returns true.
//		System.out.println("Is it greater? " + (5 > -2));
//		// prints expression and returns boolean value for comparing if 5 is
//		// greater than or equal to -2 and 5 is greater so it returns true
//		System.out.println("Is it greater or equal? " + (5 >= -2));
//		// prints expression and returns boolean value for if 5 is less than or
//		// greater than -2 which it isnt so its false.
//		System.out.println("Is it less or equal? " + (5 <= -2));
//	}

//2 Only whole numbers are used because there are integers in the operations, and not 
// floating point numbers that are decimals( ex) 3.2, 4.5f). Thus, the math may seem 'off' as numbers are rounded to nearest whole. 
//4	The % character is called 'modulus' instead of percent because it used as an operator to return the remainder of a division.  
//5 The modulus works by returning the whole number remainder of the first number divided by the second number.
//6 The order of operations is a collection of rules that determines which operations to perform first in order to evaluate a mathematical expression.
//7 Divide rounds down because integer division involves returning whole number values and so division of a whole number by another whole number that may result in a decimal is more suited to be round down for an accurate representation of the value of the number divided. 
	public static void main(String[] args) {
		
		
		
		System.out.println("I will now count my chickens:");
		System.out.println("Hens " + (25.f + 30.f / 6.f));
		System.out.println("Roosters " + (100.f - 25.f * 3.f % 4.f));
		System.out.println("Now I will count the eggs:");
		System.out.println(3.f + 2.f + 1.f - 5.f + 4.f % 2.f - 1.f / 4.f + 6.f);
		System.out.println("Is it true that 3.f + 2.f < 5.f - 7.f?");
		System.out.println(3.f + 2.f < 5.f - 7.f);
		System.out.println("What is 3.f + 2.f? " + (3.f + 2.f));
		System.out.println("What is 5.f - 7.f? " + (5.f - 7.f));
		System.out.println("Oh, that's why it's false.");
		System.out.println("How about some more.");
		System.out.println("Is it greater? " + (5.f > -2.f));
		System.out.println("Is it greater or equal? " + (5.f >= -2.f));
		System.out.println("Is it less or equal? " + (5.f <= -2.f));
  	}
}
