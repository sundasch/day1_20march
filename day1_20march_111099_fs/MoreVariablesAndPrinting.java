package day1_20march_111099_fs;

//public class MoreVariablesAndPrinting {
//	public static void main(String [] args)
//	{
//		String myName, myEyes, myTeeth,myHair; 
//		int myAge, myHeight, myWeight; 
//		
//		myName = "Zed A. Shaw";
//		myAge = 35; 
//		myHeight = 74; //inches
//		myWeight = 180; // lbs
//		myEyes = "Blue";
//		myTeeth ="White"; 
//		myHair = "Brown";
		
//		System.out.println("Let's talk about " + myName + ".");
//		System.out.println("He's " + myHeight + " inches tall.");
//		System.out.println("He's " + myWeight + " pounds heavy.");
//		System.out.println("Actually, that's not too heavy.");
//		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
//		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
//		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight
//				+ " I get " + (myAge + myHeight + myWeight) + ".");
//	}
// }
//3. no, you cannot use an integer as a variable to assign a value to.
//4. You can round a floating point number to two decimal places, as is recommended and rounds up if last number is 5 or above. 
public class MoreVariablesAndPrinting {
	public static void main(String [] args)
	{
		String Name, Eyes, Teeth, Hair; 
		int Age, Height, Weight ; 
		float newHeight, newWeight;
		Name = "Zed A. Shaw";
		Age = 35; 
		Height = 74; //inches
		Weight = 180; // lbs
		newHeight = Height * 2.54f; //centimeters
		newWeight = Weight/ 2.205f; //kg
		Eyes = "Blue";
		Teeth ="White"; 
		Hair = "Brown";
		
		System.out.println("Let's talk about " + Name + ".");
		System.out.println("He's " + Height + " inches (or " + newHeight+ " cm) tall.");
		System.out.println("He's " + Weight + " pounds (or " + newWeight + " kg) heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
		System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");
		System.out.println("If I add " + Age + ", " + Height + ", and " + Weight
				+ " I get " + (Age + Height + Weight) + ".");
	}
}