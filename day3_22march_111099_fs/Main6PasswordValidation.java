package day3_22march_111099_fs;

import java.util.Scanner;

public class Main6PasswordValidation {
	public static void main(String[] Args){
		
	
		Scanner scan3 = new Scanner(System.in);
		String stringa = new String(); 
		System.out.println("Please enter a password");
		stringa = scan3.next();		
		
		int result3 = UserMainCode8.validatePassword1(stringa);
		if (result3 == 1)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
			}
		}
			

		 int 3 = 9;




class UserMainCode8{
	public static int validatePassword1(String stringa){
		
		if (stringa.length() > 6){
			if (stringa.length() < 20){
				
				if(stringa.contains("@")){
					return 1;
	}
				if(stringa.contains("#")){
					return 1; 
				}
				
				if(stringa.contains("$")){
					return 1; 
				}
}
			
}		
		
		if(stringa.contains("0") ||stringa.contains("1") ||stringa.contains("2") ||stringa.contains("3") ||stringa.contains("4")||stringa.contains("5")||stringa.contains("6")||stringa.contains("7")||stringa.contains("8")||stringa.contains("9") ){
			return 1;
			
		}
		
			return -1; 
	}
}