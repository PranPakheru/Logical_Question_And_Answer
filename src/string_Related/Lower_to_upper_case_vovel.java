package string_Related;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//problem statement below...
//Java program to convert lowercase vowel to uppercase in string.

//for example "java" to "jAvA"
public class Lower_to_upper_case_vovel {

	public static String lowetToUpperVovel(String str) {
		
		String res = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				res += Character.toUpperCase(str.charAt(i));
			}
			else {
				res += str.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("The uppercase vovels are: " +Lower_to_upper_case_vovel.lowetToUpperVovel("java"));	//can give any string.
	}
	
//	//for custom inputs
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter any word: ");
//		String str = scan.nextLine();
//		scan.close();
//		String res = Lower_to_upper_case_vovel.lowetToUpperVovel(str);
//		System.out.println("The uppercase vovels are: " +res);
//	}
}


//by using stringbuffer

//public class Lower_to_upper_case_vovel {
//
//	public static StringBuffer lowetToUpperVovel(String str) {
//		
//		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//		StringBuffer strBuff = new StringBuffer(str);
//		
//		for(int i=0; i<str.length(); i++) {
//			if(Character.isLowerCase(str.charAt(i)) && list.contains(str.charAt(i))) {
//				strBuff.setCharAt(i, Character.toUpperCase(str.charAt(i)));
//			}
//		}
//		
//		return strBuff;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("The uppercase vovels are: " +Lower_to_upper_case_vovel.lowetToUpperVovel("java"));	//can give any string.
//	}
//	
////	//for custom inputs
////	public static void main(String[] args) {
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Please enter any word: ");
////		String str = scan.nextLine();
////		scan.close();
////		StringBuffer res = Lower_to_upper_case_vovel.lowetToUpperVovel(str);
////		System.out.println("The uppercase vovels are: " +res);
////	}
//}
