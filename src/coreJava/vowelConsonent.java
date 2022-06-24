package coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class vowelConsonent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter alphabet to check vowel or consonent");
		String alp = scan.next();
		
		String [] volwes = { "a", "e", "i", "o", "u"};
		
		if(Arrays.asList(volwes).contains(alp)){
			System.out.println("Entered alphabet is vowel");
		}
		else{
			System.out.println("Entered value is consonent");
		}
		
	}

}
