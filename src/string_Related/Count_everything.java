package string_Related;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//problem statement below
//Java program to count alphabets, digits and special characters.

public class Count_everything {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any statement: ");
		String str = scan.nextLine();
		scan.close();
		
		Count_everything.countEverything(str);
	}
	
	public static void countEverything(String str) {
		
		List<Character> specialChars = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', 
													'+', '=', '<', '>', '.', ',');
		List<Character> integerList = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
		
		int countSpecialChar = 0;
		int countNumbers = 0;
		int countCharacters = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(specialChars.contains(str.charAt(i))) {
				countSpecialChar++;
			}
			else if(integerList.contains(str.charAt(i))) {
				countNumbers++;
			}
			else if(str.charAt(i) == ' ') {
				
			}
			else {
				countCharacters++;
			}
		}
		
		System.out.println("The special characters are: " +countSpecialChar);
		System.out.println("The numbers are: " +countNumbers);
		System.out.println("The actual characters are: " +countCharacters);
	}
}
