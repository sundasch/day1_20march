package day3_22march_111099_fs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UserMainCode5 {
public static int getBigDiff(int[] arrayc){
	
	Arrays.sort(arrayc);
	
	int num1 = arrayc[0];
	int num2 = arrayc[arrayc.length - 1];
	

	if (arrayc.length == 1)
		return arrayc[0];
		else
			return num2 - num1;
	
	// use array.sort ,  indexing the first and last charcter, subtract  and then return 
}
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner B = new Scanner(System.in);
		int size1 = B.nextInt();
		int[] arrayc = new int[size1];
		for (int i = 0; i<size1; i++){
			System.out.println("Enter another number");
			arrayc[i] = B.nextInt();}
		
		int result= UserMainCode5.getBigDiff(arrayc);
		System.out.println("Here is your result");
		System.out.println(result);
// here use scanner to give input, initialize the array here as well 
		
	}

}
