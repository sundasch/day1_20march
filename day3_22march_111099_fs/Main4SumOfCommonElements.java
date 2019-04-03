package day3_22march_111099_fs;

import java.util.Scanner;

public class Main4SumOfCommonElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Reading input for first array size
		int n = sc.nextInt();
		
		//Reading input for second size
		int m = sc.nextInt();
		
		int[] arraya = new int[n];
		int[] arrayb = new int[m];
		
		
		//Reading elements for first array
		for (int i = 0; i < n ;i++)
		arraya[i] = sc.nextInt();
		
		//Reading elements for 2nd array
		for (int i= 0; i < m ; i++)
		arrayb[i] = sc.nextInt();
		
		
		// Getting the sum of Intersections
		int y = UserMain4.GetSomeOfIntersection(arraya,arrayb);
		
		
		 
	}

}

class UserMain4{
	
	public static int GetSomeOfIntersection(int arraya[], int arrayb[] ) {
		int sum = 0;
		int element=0;
		for(int i = 0;i <arraya.length; i++){
			element=arraya[i];
			for(int j = 0;j<arrayb.length;j++){
				if(element == arrayb[j])
					sum = sum+ element;
				
			}
				
					
		}	
		if(sum == 0)
			return -1;
		else
			return sum; 
	}

	
}

