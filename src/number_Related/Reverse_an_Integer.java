package number_Related;

import java.util.Scanner;

//problem statement below
//Write a program to reverse an integer in Java.
public class Reverse_an_Integer {
	
	
	public int reverseInteger(int n) {
		
		int remainder, result=0;
		
		while(n!=0) {
			remainder = n%10;
			result = (result*10) + remainder;
			n /= 10;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		//making an object to call the non-static method.
		Reverse_an_Integer revInt = new Reverse_an_Integer();
		
		//using scanner class for custom input.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to be reversed...");
		int n = scan.nextInt();
		scan.close();
		int x = revInt.reverseInteger(n);
		System.out.println("Reverse of above integer is...");
		System.out.println(x);
	}
}
