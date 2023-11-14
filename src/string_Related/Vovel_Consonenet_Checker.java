package string_Related;

import java.util.Scanner;
import java.util.regex.Pattern;

//problem statement below...
//Java program to check given character is vowel or consonant.
public class Vovel_Consonenet_Checker {
	
	public String vovelConsonent(char ch) {
		if(ch >= 'a' && ch <= 'z') {
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return "Vovel";
			}
			else {
				return "Consonent";
			}
		}
		else {
			return "Given data is not a character";
		}
	}
	
	public static void main(String[] args) {
		Vovel_Consonenet_Checker vovCon = new Vovel_Consonenet_Checker();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character:");
		char ch = scan.next().toLowerCase().charAt(0);
		String res = vovCon.vovelConsonent(ch);
		System.out.println("The given character is: " +res);
	}
}


//another approach, using Regex
//public class Vovel_Consonenet_Checker {
//	
//	public String vovelConsonent(char ch) {
//		
//		if(ch >= 'a' && ch <= 'z') {
//			String vovels = "[aeiouAEIOU]";
//			boolean res = Pattern.matches(vovels, String.valueOf(ch));
//			
//			if(res==true) {
//				return "Vovel";
//			}
//			else {
//				return "Consonent";
//			}
//		}
//		else {
//			return "Not recognizable character";
//		}
//	}
//	
//	public static void main(String[] args) {
//		Vovel_Consonenet_Checker vovCon = new Vovel_Consonenet_Checker();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a character:");
//		char ch = scan.next().toLowerCase().charAt(0);
//		String res = vovCon.vovelConsonent(ch);
//		System.out.println("The given character is: " +res);
//	}
//}
