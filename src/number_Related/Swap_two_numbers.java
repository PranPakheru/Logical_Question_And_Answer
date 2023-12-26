package number_Related;

import java.util.Scanner;

//problem statement below...
//Write a program in Java to swap two numbers without using third variable.

public class Swap_two_numbers {
	
	public static void swapTwoVariables(int x, int y) {
		System.out.println("Before swapping x: " +x);	//5
		System.out.println("Before swapping y: " +y);	//6
		
		x = x+y;	//11
		y = x-y;	//5
		x = x-y;	//6
		
		System.out.println("After swapping x: " +x);
		System.out.println("After swapping y: " +y);
	}
	
	public static void main(String[] args) {
		Swap_two_numbers.swapTwoVariables(5, 6);
	}
	
	//for custom inputs
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter x: ");
//		int x = scan.nextInt();
//		System.out.println("Please enter y: ");
//		int y = scan.nextInt();
//		scan.close();
//		
//		Swap_two_numbers.swapTwoVariables(x, y);
//	}
}



//Write a program in Java to swap two numbers using third variable.

//public class Swap_two_numbers {
//	
//	public static void swapTwoVariables(int x, int y) {
//		System.out.println("Before swapping x: " +x);	//5
//		System.out.println("Before swapping y: " +y);	//6
//		
//		int temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println("After swapping x: " +x);	
//		System.out.println("After swapping y: " +y);	
//	}
//	
////	public static void main(String[] args) {
////		Swap_two_numbers.swapTwoVariables(5, 6);
////	}
//	
//	//for custom inputs
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter x: ");
//		int x = scan.nextInt();
//		System.out.println("Please enter y: ");
//		int y = scan.nextInt();
//		scan.close();
//		
//		Swap_two_numbers.swapTwoVariables(x, y);
//	}
//}