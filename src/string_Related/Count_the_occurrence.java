package string_Related;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//problem statement below...
//Java program to count Occurrence Of Vowels & Consonants in a String.

//below mwthod will count every character irrespective of vovel or consonent

public class Count_the_occurrence {

	public static void countTheOccurrencyOfString(String str) {
		
		//if you want you can uncomment below to have all lower case and replace str with str1
//		String str1 = str.toLowerCase();
		
		List<Character> listCh = new ArrayList<>();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			listCh.add(str.charAt(i));
		}
		
		List<Character> list = listCh.stream().sorted().collect(Collectors.toList());
		
		for(int i=0; i<str.length(); i++) {
			hm.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
		}
		
		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			System.out.println("The character is: " +m.getKey() +" its occurrence is: " +m.getValue());
		}
	}
	
	public static void main(String[] srgs) {
		Count_the_occurrence.countTheOccurrencyOfString("Honesty is the best policy");
	}
	
//	//for custom input
//	public static void main(String[] srgs) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter any line or phrase...");
//		String str = scan.nextLine();
//		scan.close();
//		Count_the_occurrence.countTheOccurrencyOfString(str);
//	}
}




//another method
//below mwthod will only count the no of vovel and consonent.

//public class Count_the_occurrence {
//
//	public static void countVovelAndConsonent(String str) {
//		
//		String str1 = str.toLowerCase();
//		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
//		List<Character> list1 = Arrays.asList('@', '!', '#', '$', '%', '^', '&', '*', ' ');
//		int countVov = 0, countCon = 0;
//		for(int i=0; i<str1.length(); i++) {
//			
//				if(list.contains(str.charAt(i))) {
//					countVov++;
//				}
//				else if(!list1.contains(str.charAt(i))){
//					countCon++;
//				}
//			
//		}
//		System.out.println("The no of vovel are: " +countVov);
//		System.out.println("The no of conconent are: " +countCon);
//	}
//	
//	public static void main(String[] srgs) {
//		Count_the_occurrence.countVovelAndConsonent("Honesty is the best policy");
//	}
//	
////	//for custom input
////	public static void main(String[] srgs) {
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Please enter any line or phrase...");
////		String str = scan.nextLine();
////		scan.close();
////		Count_the_occurrence.countVovelAndConsonent(str);
////	}
//}



//Java program to count alphabets, digits and special characters.

//public class Count_the_occurrence {
//
//	public static void countTheOccurrencyOfEverything(String str) {
//		
//		List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
//		List<Character> listSpCh = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+', '<', '>', '?', '/',
//				',', '.', '|', '{', '}', '[', ']', '`', '~');
//		int countInt = 0;
//		int countSpCh = 0;
//		int countAlph = 0;
//		
//		for(int i=0; i<str.length(); i++) {
//			if(listInt.contains(Character.getNumericValue(str.charAt(i)))) {
//				countInt++;
//			}
//			else if(listSpCh.contains(str.charAt(i))) {
//				countSpCh++;
//			}
//			else if(str.charAt(i) == ' ' ){
//				
//			}
//			else{
//				countAlph++;
//			}
//		}
//		
//		System.out.println("The number of integers are: " +countInt);
//		System.out.println("The number of special character are: " +countSpCh);
//		System.out.println("The number of alphabets are: " +countAlph);
//	}
//	
////	public static void main(String[] srgs) {
////		Count_the_occurrence.countTheOccurrencyOfEverything("Honesty is the best policy");
////	}
//	
//	//for custom input
//	public static void main(String[] srgs) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter any line or phrase...");
//		String str = scan.nextLine();
//		scan.close();
//		Count_the_occurrence.countTheOccurrencyOfEverything(str);
//	}
//}