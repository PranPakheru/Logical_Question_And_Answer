package string_Related;

import java.util.Scanner;

//problem statement below...
//Java program to convert lowercase char to uppercase of string.

public class Char_string_conversion {

	public static String lowerCharToUpperString(String str) {
		
		return str.toUpperCase();
	}
	
	public static void main(String[] args) {
		String res = Char_string_conversion.lowerCharToUpperString("PraNav");   //can give any inputs here
		System.out.println(res);
	}

	//for custom inputs
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter any statement...");
//		String str = scan.nextLine();
//		scan.close();
//		System.out.println("The upper case statement is: ");
//		System.out.println(Char_string_conversion.lowerCharToUpperString(str));
//	}
}
