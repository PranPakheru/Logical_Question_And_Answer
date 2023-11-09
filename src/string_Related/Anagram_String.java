package string_Related;

import java.util.Arrays;
import java.util.Scanner;

//problem statement below.
//Write a program to check if two String are Anagram.

//Anagram means all the letters of two words or sentences are same, for example "Stop" and "Spot".
public class Anagram_String {

	public void anagramString(String str1, String str2) {
		char[] strOne = str1.toLowerCase().toCharArray();
		char[] strTwo = str2.toLowerCase().toCharArray();
		
		Arrays.sort(strOne);
		Arrays.sort(strTwo);
		
		if(true==Arrays.equals(strOne, strTwo)) {
			System.out.println("The two words/sentences are Anagram.");
		}
		else{
			System.out.println("The two words/sentences are not Anagram.");
		}
	}
	
	public static void main(String[] args) {
		Anagram_String anStr = new Anagram_String();
		anStr.anagramString("Stop", "Spot");
	}
	
//	//for custom inputs
//	public static void main(String[] args) {
//		Anagram_String anStr = new Anagram_String();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your first word/sentence...");
//		String str1 = scan.nextLine();
//		System.out.println("Please enter your second word/sentence...");
//		String str2 = scan.nextLine();
//		scan.close();
//		anStr.anagramString(str1, str2);
//	}
}



////another approach (without any predefined methods)
//public class Anagram_String {
//
//	public boolean anagramString(String str1, String str2) {
//		
//		if(str1.length() == str2.length()) {
//			
//			char[] strOne = new char[str1.length()];
//			char[] strTwo = new char[str2.length()];
//			
//			for(int i=0; i<str1.length(); i++) {
//				strOne[i] = str1.charAt(i);
//				strTwo[i] = str2.charAt(i);
//			}
//			
//			for(int i=0; i<str1.length(); i++) {
//				for(int j=i+1; j<str1.length(); j++) {
//					if(strOne[i] > strOne[j]) {
//						char temp;
//						temp = strOne[j];
//						strOne[j] = strOne[i];
//						strOne[i] = temp;
//					}
//				}
//			}
//			
//			for(int i=0; i<str2.length(); i++) {
//				for(int j=i+1; j<str2.length(); j++) {
//					if(strTwo[i] > strTwo[j]) {
//						char temp; 
//						temp = strTwo[j];
//						strTwo[j] = strTwo[i];
//						strTwo[i] = temp;
//					}
//				}
//			}
//			
//			int count = 0;
//			
//			for(int i=0; i<str1.length(); i++) {
//				if(strOne[i] == strTwo[i]) {
//					count++;
//				}
//			}
//			
//			if(count == str1.length()) {
//				return true;
//			}
//			else {
//				return false;
//			}
//			
//		}
//		else {
//			return false;
//		}
//		
//	}
//
//
//	public static void main(String[] args) {
//		Anagram_String anStr = new Anagram_String();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your first word/sentence...");
//		String str1 = scan.nextLine();
//		System.out.println("Please enter your second word/sentence...");
//		String str2 = scan.nextLine();
//		scan.close();
//		if(true == anStr.anagramString(str1, str2)) {
//			System.out.println("The two words/sentences are Anagram");
//		}
//		else{
//			System.out.println("The two words/sentences are not Anagram");
//		}
//	}
//
//}
