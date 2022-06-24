package coreJava;

import java.util.Scanner;

public class primeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value");
		int value = scan.nextInt();
		
		if (value > 0){
			for(int i=1; i< value; i++){
				if((value%i == 0) && (i%2 == 0)){
					System.out.println(i);
				}
			}
		}
		else{
			System.out.print("Enter valid values");
		}
	}
}
