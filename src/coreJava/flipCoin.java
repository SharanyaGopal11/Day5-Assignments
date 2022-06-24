package coreJava;

import java.util.Scanner;

public class flipCoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of times to flip coin");
		
		int count = scanner.nextInt();
		int hcount = 0;
		int tcount = 0;
		
		
		for(int i=0; i< count; i++){
			double num = Math.random();
			if (num > 0.5){
			  System.out.println("num "+ num);
			  hcount = hcount + 1;
			}
			else{
			  System.out.println("num"+num);
			  tcount = tcount + 1;
			}
		}
		
		double perhead = (double)(((hcount * 100)/ count) );
		float  pertail = (float)((( tcount * 100)/count));
		
		System.out.println("head count "+hcount +"head count percentage "+perhead);
		System.out.println("tail count "+tcount +"tail count percentage "+pertail);
	}

}
