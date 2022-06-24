package coreJava;

import java.util.Scanner;

public class remainderQuotient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter dividend ");
		float dividend = scan.nextFloat();
		
		System.out.println("Enter divisor  ");
		float divisor = scan.nextFloat();
		
		float quotient = dividend / divisor;
	    float remainder = dividend % divisor;
	    
	    System.out.println("Quotient is "+quotient);
	    System.out.println("Remainder is "+remainder);
	}

}
