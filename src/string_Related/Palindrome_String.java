package string_Related;

import java.util.Arrays;
import java.util.Scanner;

//problem statement below...
//Write a program to check a String is palindrome or not.
public class Palindrome_String {
	
	public boolean palindromeString(String str1, String str2) {
		
		if(str1.length() == str2.length()) {
			int count = 0;
			for(int i=0; i<str1.length(); i++) {
				if(str1.toLowerCase().charAt(i) == str2.toLowerCase().charAt(str1.length()-i-1)) {
					count++;
				}
			}
			if(count == str1.length()) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Palindrome_String palStr = new Palindrome_String();
		String str1 = "Tip";
		String str2 = "Pit";
		
		boolean res = palStr.palindromeString(str1, str2);
		
		if(res == true) {
			System.out.println("Both Strings are Palindrome;");
		}
		else {
			System.out.println("Both Strings are not Palindrome;");
		}
		
	}
	
//	//for custom input
//	public static void main(String[] args) {
//		Palindrome_String palStr = new Palindrome_String();
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter first word/phrase...");
//		String str1 = scan.nextLine();
//		System.out.println("Please enter second word/phrase...");
//		String str2 = scan.nextLine();
//		scan.close();
//		
//		boolean res = palStr.palindromeString(str1, str2);
//		
//		if(res == true) {
//			System.out.println("Both Strings are Palindrome;");
//		}
//		else {
//			System.out.println("Both Strings are not Palindrome;");
//		}
//	}
}


////for a single string to be palindrome, use this approach
//public class Palindrome_String {
//	
//	public boolean palindromeString(String str) {
//		int count = 0;
//		for(int i=0; i<str.length(); i++) {
//			if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(str.length()-1-i)) {
//				count++;
//			}
//		}
//		if(count == str.length()) {
//			return true;
//		}
//		return false;
//	}
//
//	
//	//for custom input
//	public static void main(String[] args) {
//		Palindrome_String palStr = new Palindrome_String();
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a Palindrome word/phrase...");
//		String string = scan.nextLine();
//		scan.close();
//		
//		boolean res = palStr.palindromeString(string);
//		
//		if(res == true) {
//			System.out.println("Word/Phrase is Palindrome;");
//		}
//		else {
//			System.out.println("Word/Phrase is not Palindrome;");
//		}
//	}
//}
