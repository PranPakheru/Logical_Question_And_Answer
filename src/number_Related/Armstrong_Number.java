package number_Related;

import java.util.Scanner;

//problem statement below...
//Write a program in Java to check whether an integer is Armstrong number or not.

//an Armstrong number is a number who's digits cube's sum is equal to that number
//	i.e 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//	more Armstrong numbers are -> 370, 371, 407 etc.

public class Armstrong_Number {
	
	public boolean armstrongNumber(int n) {
		
		int x = n, y = n, result = 0, remainder, power=0;
		
		while(y!=0) {
			y /= 10;
			power++;
		}

		while(x!=0) {
			remainder = x%10;
			result += Math.pow(remainder, power);
			x /= 10;
		}

		if(n==result) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Armstrong_Number armNum = new Armstrong_Number();
		System.out.println("Please enter a number...");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		boolean res = armNum.armstrongNumber(n);
		if(res==true) {
			System.out.println("The number " +n +" is an Armstrong number.");
		}
		else {
			System.out.println("The number " +n +" is not an Armstrong number.");
		}
	}
}
