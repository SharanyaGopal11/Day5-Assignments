package coreJava;

import java.util.Scanner;

public class swapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value 1");
		int num1 = scan.nextInt();
		System.out.println("Enter value 2");
		int num2 = scan.nextInt();
		
		int swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("Swaped values are num1 "+num1+" num2 "+num2);
		
	}

}
