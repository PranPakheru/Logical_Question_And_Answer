package string_Related;

import java.util.Scanner;

//problem statement below...
//Write a method in Java which will remove any given character from a String.


//normal method without using any predefined method.
public class Remove_a_character {
	
	
	public String removeCharacter(String str, char ch) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ch) {
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Remove_a_character remCh = new Remove_a_character();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string...");
		String str = scan.nextLine();
		System.out.println("Please enter a character to be removed...");
		char ch = scan.next().charAt(0);
		scan.close();
		System.out.println("Character removed string is...");
		System.out.println(remCh.removeCharacter(str, ch));
		
	}
}


//easy method.
//public class Remove_a_character {
//	
//	
//	public String removeCharacter(String str, char ch) {
//		
//		return str.replace(ch, '*'); 
//	}
//	
//	public static void main(String[] args) {
//		
//		Remove_a_character remCh = new Remove_a_character();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a string...");
//		String str = scan.next();
//		System.out.println("Please enter a character to be removed...");
//		char ch = scan.next().charAt(0);
//		scan.close();
//		System.out.println("Character removed string is...");
//		System.out.println(remCh.removeCharacter(str, ch));
//		
//	}
//}