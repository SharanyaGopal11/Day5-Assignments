package coreJava;

import java.util.Scanner;

public class powerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter power of 2 range below 31");
		int range = scan.nextInt();
		
		if (range > 0 && range < 31){
			for(int i=0; i< range; i++){
				int value = (int)(Math.pow(2, i));
				System.out.println("power of 2 "+value);
			}
		}
		else{
			System.out.println("enter value below 32");
		}
	}

}
