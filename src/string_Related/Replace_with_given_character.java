package string_Related;

import java.util.Scanner;

//problem statement below...
//Java program to replace the string space with a given character.

public class Replace_with_given_character {
	
    //using predefined method.
	public static String changeInString(String str, char ch) {
		
		return str.replace(' ', ch);	
	}
	
	public static void main(String[] args) {
		String str = "Honesty is the best policy.";
		System.out.println(Replace_with_given_character.changeInString(str, '*'));
	}
	
	//for custom input.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the string...");
//		String str = scan.nextLine();
//		System.out.println("Please enter a character to replace the space...");
//		char ch = scan.next().toLowerCase().charAt(0);
//		scan.close();
//		System.out.println(Replace_with_given_character.changeInString(str, ch));
//	}
}


//another approach
//public class Replace_with_given_character {
//	
//	//using custom method.
//	public static String changeInString(String str, char ch) {
//		
//		String str1 = "";
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				str1 += ch;
//			}
//			else {
//				str1 += str.charAt(i);
//			}
//		}
//		return str1;
//	}
//	
//	public static void main(String[] args) {
//		String str = "Honesty is the best policy.";
//		System.out.println(Replace_with_given_character.changeInString(str, '*'));
//	}
//	
////	//for custom input.
////	public static void main(String[] args) {
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Please enter the string...");
////		String str = scan.nextLine();
////		System.out.println("Please enter a character to replace the space...");
////		char ch = scan.next().toLowerCase().charAt(0);
////		scan.close();
////		System.out.println(Replace_with_given_character.changeInString(str, ch));
////	}
//}
