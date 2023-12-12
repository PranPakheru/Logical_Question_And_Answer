package number_Related;

import java.util.Scanner;

//problem statement below.
//Write a program in Java to check whether a number is Palindrome or not using iteration.

//a palindrome number is which is equal read from both left and right side i.e 1221, 456654, 121, 135531, 88 etc.
//public class Palindrome_Number {
//
//	public void palindromeNumber(int n) {
//		
//		int result = 0, remainder = 0;
//		int newNum = n;
//		while(newNum != 0) {
//			remainder = newNum%10;
//			result = result*10 + remainder;
//			newNum /= 10;
//		}
//		
//		if(result == n) {
//			System.out.println("The number: " +n +" is a Palindrome number.");
//		}
//		else {
//			System.out.println("The number is not Palindrome.");
//		}
//	}
//	
//	public static void main(String[] args) {
//		Palindrome_Number palNum = new Palindrome_Number();
//		palNum.palindromeNumber(121); //can give 1221, 456654, 121, 135531, 88 etc. or anyhting
//	}
//	
////	//for custom input
////	public static void main(String[] args) {
////		Palindrome_Number palNum = new Palindrome_Number();
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Please enter a Palindrome number: ");
////		int num = scan.nextInt();
////		scan.close();
////		palNum.palindromeNumber(num); 
////	}
//}



//Write a program in Java to check whether a number is Palindrome or not using "Iteration".
public class Palindrome_Number {

	public void palindromeNumber(int n) {
		
		if(n == Palindrome_Number.reverseNum(n)) {
			System.out.println("The number is palindrome.");
		}
		else {
			System.out.println("The number is not palindrome.");
		}
	}
	
	public static int reverseNum(int num) {
		int x = num;
		int res = 0;
		while(x != 0) {
			res = res*10 +  x%10;
			x /= 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Palindrome_Number palNum = new Palindrome_Number();
		palNum.palindromeNumber(1212); //can give 1221, 456654, 121, 135531, 88 etc. or anyhting
	}
	
//	//for custom input
//	public static void main(String[] args) {
//		Palindrome_Number palNum = new Palindrome_Number();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a Palindrome number: ");
//		int num = scan.nextInt();
//		scan.close();
//		palNum.palindromeNumber(num); 
//	}
}
