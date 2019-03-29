package day1_20march_111099_fs;

//public class VariablesAndNames {
	
	//public static void main(String [] args)
//	{
//		int cars, drivers, passengers, cars_not_driven, cars_driven;
//		double space_in_a_car, carpool_capacity, average_passengers_per_car; 
//		here cars is set to a value integer 100
//		cars = 100; 
//      variable space_in_a_car is set to floating point 4.0 (decimal)
//		space_in_a_car = 4.0; 
//      variable drivers is assigned integer value 30
//		drivers = 30;
//      variable passengers is assigned to integer value 90
//		passengers = 90;
//      variable cars_not_driven is assigned to the value of the difference between variable cars and drivers
//		cars_not_driven = cars - drivers; 
//      variable cars_driven is equal to the value of the variable drivers
//		cars_driven = drivers; 
//      variable carpool_capacity is assigned a value equal to the product of cars_driven  and space_in_a_car
//		carpool_capacity  = cars_driven * space_in_a_car;
//      variable average_passengers_per_car is assigned a value equal to the value of variable passengers divided by the variable cars_driven
//		average_passengers_per_car = passengers / cars_driven ; 
//		
//		System.out.println("There are " + cars + " cars available."); 
//		System.out.println("There are only " + drivers + " drivers available."); 
//		System.out.println("There will be " + cars_not_driven + " empty cars today"); 
//		System.out.println("We can transport " + carpool_capacity + " people today."); 
//		System.out.println("We have " + passengers + " to carpool today"); 
//		System.out.println("We need to put about " + average_passengers_per_car + " in each car."); 
//		
//      }
//	}
//2  A floating point number is a number that contains a decimal, it not a whole number/integer.
//6 a single equal is an assignment operator assigns a value to a variable, whereas a double equal is a relational operator used to check if two variable values are equal or not.  
// with 4 for space_in_a_car:
public class VariablesAndNames {
	
	public static void main(String [] args)
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car; 
		
		cars = 100; 
		space_in_a_car = 4 ; 
		drivers = 30;
		passengers = 90;
		cars_not_driven = cars - drivers; 
		cars_driven = drivers; 
		carpool_capacity  = cars_driven * space_in_a_car;
		average_passengers_per_car = passengers / cars_driven ; 
		
		System.out.println("There are " + cars + " cars available."); 
		System.out.println("There are only " + drivers + " drivers available."); 
		System.out.println("There will be " + cars_not_driven + " empty cars today"); 
		System.out.println("We can transport " + carpool_capacity + " people today."); 
		System.out.println("We have " + passengers + " to carpool today"); 
		System.out.println("We need to put about " + average_passengers_per_car + " in each car."); 
		
       }
	}