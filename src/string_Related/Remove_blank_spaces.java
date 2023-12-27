package string_Related;

import java.util.Scanner;

//problem statement below...
//Java program to remove blank space from string.

public class Remove_blank_spaces {

	public static String removeBlankSpace(String str) {
		
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				res += str.charAt(i);
			}
		}
		
		return res;
	}
	
//	public static void main(String[] args) {
//		
//		String result = Remove_blank_spaces.removeBlankSpace("Honesty is the best policy.");
//		System.out.println("After removing the blank spaces: " +result);
//	}
	
	//for custom inputs
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any phrase: ");
		String result = scan.nextLine();
		scan.close();
		
		System.out.println("After removing the blank spaces: " +Remove_blank_spaces.removeBlankSpace(result));
	}
}
