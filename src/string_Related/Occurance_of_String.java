package string_Related;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//problem statement below...
//Write a program in Java to count occurrence of a given character in a String?

//there are several ways to solve it, one of which is below.
//by using map, list and collections concept 		""This is the best way"".

public class Occurance_of_String {
	
	public int occuranceOfString(String str, char ch) {
		String str1 = str.toLowerCase();
		int count = 0;
		for(int i=0; i<str1.length(); i++) {
			if(ch == str1.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Occurance_of_String occStr = new Occurance_of_String();
		System.out.println("Please enter a phrase...");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("please enter the character to count...");
		char ch = scan.next().charAt(0);
		scan.close();
		
		System.out.println("the count of character: " +ch +" is: " +occStr.occuranceOfString(str, ch));;
	}
}



//another way
//public class Occurance_of_String {
//	
//	public void occuranceOfString(String str) {
//		
//		int n = str.length();
//		String str1 = str.toLowerCase();
//		
//		//put the characters in a list
//		List<Character> listCh = new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			listCh.add(str1.charAt(i));
//		}
//		List<Character> sortedList = listCh.stream().sorted().collect(Collectors.toList()); 
//		
//		//create a map to properly add the characters and it's occurrence.
//		Map<Character, Integer> hm = new HashMap<Character, Integer>();
//		for(int i=0; i<n; i++) {
//			hm.putIfAbsent(sortedList.get(i), Collections.frequency(sortedList, sortedList.get(i)));
//		}
//		
//		//print the occurrence of characters.
//		for(Map.Entry<Character, Integer> map : hm.entrySet()) {
//			System.out.println("The character is- " +map.getKey() +" and its occurrence is- " +map.getValue());
//		}
//	}
//	
//
//	public static void main(String[] args) {
//		
//		Occurance_of_String occStr = new Occurance_of_String();
//		System.out.println("Please enter a phrase...");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		scan.close();
//		
//		occStr.occuranceOfString(str);
//	}
//}




