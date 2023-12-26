package string_Related;

import java.util.HashMap;
import java.util.Scanner;

//problem statement below...
//Java program to print the highest frequency character in a String.

public class Highest_frequency_character {

	public static char highestFrequency(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		int count = 0;
		char ch = ' ';
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
				
				if(count < hm.get(str.charAt(i))) {
					ch = str.charAt(i);
					count = hm.get(str.charAt(i));
				}
			}
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		System.out.println(Highest_frequency_character.highestFrequency("abcaabbb"));	//a
	}
	
	//for custom inputs
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your string:");
//		String str = scan.nextLine();
//		scan.close();
//		System.out.println("The highest occurring character is: " +Highest_frequency_character.highestFrequency(str));
//	}
}
