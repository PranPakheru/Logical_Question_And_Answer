package string_Related;

import java.util.Scanner;
import java.util.regex.Pattern;

//problem statement below.
//Java program to check given character is digit or not.
public class Checking_Digit {

	public void chechDigit(char ch) {
		String digit = "[0-1]";
		boolean matches = Pattern.matches(digit, String.valueOf(ch));
		if(matches == true) {
			System.out.println("Given data is digit.");
		}
		else {
			System.out.println("Given data is not a digit.");
		}
		
	}
	
//	public static void main(String[] args) {
//		Checking_Digit chDig = new Checking_Digit();
//		chDig.chechDigit('2'); 	//can give anything, but only in one character at a time.
//	}
	
	//for another approach
	public static void main(String[] args) {
		Checking_Digit chDig = new Checking_Digit();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a digit:");
		char ch = scan.next().toLowerCase().charAt(0);
		chDig.chechDigit(ch);
	}
}
