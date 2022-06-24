package coreJava;

import java.util.Scanner;

public class leapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 digit year ");
		year = scan.nextInt();
		if (Integer.toString(year).length() == 4){
			if( ( year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0 )) ){
			 System.out.println("Entered year is leap year "+year);
			}
			else{
				System.out.println("Entered year is not leap year "+year);
			}
		}
		else{
			System.out.println("Entered year is not 4 digit "+year);
		}
		
		
		
	}

}
