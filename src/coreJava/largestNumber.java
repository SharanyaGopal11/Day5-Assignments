package coreJava;

import java.util.Scanner;

public class largestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 values");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int maxvalue = Math.max(num1, Math.max(num2, num3));
		
		System.out.print("Max value within 3 numbers is "+maxvalue);
		
		
	}

}
