package number_Related;

import java.util.Scanner;

//problem statement below...
//Write a program in Java to find given number is perfect or not.

//Explaination- perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,
//	which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8128

public class Perfect_number {

	public static void perfectNumber(int n) {
		
		int result = 0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				result += i;
			}
		}
		
		if(result == n) {
			System.out.println("The number " +n +" is perfect.");
		}
		else {
			System.out.println("The number " +n +" is not perfect.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = scan.nextInt();
		scan.close();
		
		Perfect_number.perfectNumber(n);
	}
}
