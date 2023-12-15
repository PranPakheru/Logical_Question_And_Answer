package number_Related;

import java.util.Scanner;

//problem statement below...
//Write a program in Java to find sum of digits of a number.

public class Sum_of_digits_of_number {

	public static int sumOfDigits(int x) {
		
		int res = 0;
		while(x!=0) {
			res += x%10;
			x /= 10;
		}
		
		return res;
	}
	
//	public static void main(String[] args) {
//		System.out.println(Sum_of_digits_of_number.sumOfDigits(125));	//can give any number
//	}
	
	//for custom inputs
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter digit...");
		int x = scan.nextInt();
		scan.close();
		System.out.println("The sum of digits of number is: " +Sum_of_digits_of_number.sumOfDigits(x));
	}
}
