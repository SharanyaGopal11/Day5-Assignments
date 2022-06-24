package coreJava;

import java.util.Scanner;

public class harmonicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for range");
		int n = scan.nextInt();
		float value = 0;
		
		if(n >0){
			for(int i = 1; i<= n; i++){
				float val = (float)(1/i);
				value = value + val;
			}
			System.out.println("Harmonic value is "+value);
		}
		else{
			System.out.println("Enter vaild values");
		}
	}

}
