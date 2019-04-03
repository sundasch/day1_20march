package day3_22march_111099_fs;

import java.util.Scanner;

public class Main7CalculateElectricityBill {

	public static void main(String[] args) {
		Scanner oldbill = new Scanner(System.in);
		Scanner newbill = new Scanner(System.in);
		Scanner charge = new Scanner(System.in);
		String oldbill1 = new String();
		String newbill1 = new String();
		System.out.println("Enter Old Bill");
		oldbill1 = oldbill.next();
		System.out.println("Enter New Bill");
		newbill1 = newbill.next();
		System.out.println("enter unit charge");
	    int charge1 = charge.nextInt(); 
		
	    int oldBillInt=Integer.parseInt(oldbill1.substring(5)); 
		int newBillInt = Integer.parseInt(newbill1.substring(5));
		int endresult1 = UserMainCodex.calculateElectricityBill(oldBillInt, newBillInt, charge1);
		System.out.println("This is the bill!" + endresult1);
	}

}
class UserMainCodex{
	
	public static int calculateElectricityBill(int oldBillInt, int newBillInt, int charge1){
		int total1 = newBillInt - oldBillInt;
		int total2 = total1 * charge1;
				return total2;
				
	}
}