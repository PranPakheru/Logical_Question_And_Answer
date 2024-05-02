package number_Related;

import java.util.Scanner;

//problem statement below
//Java Program to calculate factorial using iterative and recursive method.

/*
 * Factorial means multiply the number and keep decreasing it by 1 until it becomes one
 * i.e 5! = 5*4*3*2*1 = 120
 * i.e 3! = 3*2*1 = 6
 * and so on...
 */

public class Factorial_of_a_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number: ");
		int n = scan.nextInt();
		scan.close();
		
		System.out.println("using iterative approach: " +Factorial_of_a_number.usingIterativeApproach(n));
		System.out.println("using recursive approach: " +Factorial_of_a_number.usingRecursiveApproach(n));
	}
	
	public static int usingIterativeApproach(int n) {
		
		if(n < 0) {
			return -1;
		}
		else {
			int res = 1;
			for(int i=n; i>0; i--) {
				res *= i;
			}
			return res;
		}
	}
	
	public static int usingRecursiveApproach(int n) {
		
		if(n < 0) {
			return -1;
		}
		else if(n == 0) {
			return 1;
		}
		else {
			return n * usingRecursiveApproach(n-1);
		}
	}
}
