package coreJava;

import java.util.Scanner;

public class evenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value ");
		int val = scan.nextInt();
		
		if (val%2 == 0){
			System.out.print("Entered value is even "+val);
		}
		else{
			System.out.print("Entered value is odd "+val);
		}
	}

}
