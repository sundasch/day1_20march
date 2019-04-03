package day3_22march_111099_fs;

import java.util.Scanner;

public class Main5NumberValidation {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		char[] array1 = new char[12];
		
		for(int h= 0; h<12; h++){
			System.out.println("Enter a number");
			char a = r.next().charAt(0);
			array1[h] = a;
		}
		  int result = UserMainCode6.validateNumber(array1);
		if (result == 1){
			System.out.println("Valid number format");
		}
		else if (result == -1){
			System.out.println("Invalid number format");
		}
	}
}
class UserMainCode6	{
	public static int validateNumber(char[] array1){
		
		if (array1[3] == '-') {
			if (array1[7] == '-'){
				return 1;
			}
		}
		else{
			return -1;
		}
		
		
		return -1;
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


