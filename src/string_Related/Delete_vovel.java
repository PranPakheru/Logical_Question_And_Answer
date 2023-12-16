package string_Related;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//problem statement below...
//Java program to delete vowels in a given string.

public class Delete_vovel {
	
	public static StringBuffer deleteTheVovel(String str) {
		
		StringBuffer strBuff = new StringBuffer(str);
		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		for(int i=0; i<str.length(); i++) {
			if(list.contains(str.charAt(i))) {
				strBuff.setCharAt(i, ' ');
			}
		}
		return strBuff;
	}
	
	public static void main(String[] srgs) {
		System.out.println(Delete_vovel.deleteTheVovel("acacaear"));		//can give any inputs here...
	}
	
	//for custom inputs...
//	public static void main(String[] srgs) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter any phrase...");
//		String str = scan.nextLine();
//		scan.close();
//		System.out.println("After deleting vovel: " +Delete_vovel.deleteTheVovel(str));
//	}
}


//alternate method
//public class Delete_vovel {
//	
//	public static StringBuffer deleteTheVovel(String str) {
//		
//		StringBuffer strBuff = new StringBuffer();
//		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//		for(int i=0; i<str.length(); i++) {
//			if(!list.contains(str.charAt(i))) {
//				strBuff.append(str.charAt(i));
//			}
//		}
//		return strBuff;
//	}
//	
//	public static void main(String[] srgs) {
//		System.out.println(Delete_vovel.deleteTheVovel("abcde"));		//can give any inputs here...
//	}
//	
//	//for custom inputs...
////	public static void main(String[] srgs) {
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Enter any phrase...");
////		String str = scan.nextLine();
////		scan.close();
////		System.out.println("After deleting vovel: " +Delete_vovel.deleteTheVovel(str));
////	}
//}
