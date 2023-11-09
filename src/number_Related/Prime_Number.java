package number_Related;

import java.util.Scanner;

//problem statement below.
//Write a program to check given number is prime or not.

public class Prime_Number {
	
	public void primeNumber(int n) {
		int temp = 0;
		for(int i=2; i<n; i++) {
			
			if(n%i==0) {
				temp++;
				break;
			}
		}

		if(temp==1) {
			System.out.println("The number " +n +" is a not Prime Number.");
		}
		else {
			System.out.println("The number " +n +" is a Prime Number.");
		}
	}
	
	public static void main(String[] args) {
		Prime_Number pn = new Prime_Number();
		int n = 15; //use any- 2, 4, 3, 5, 7, 43, 49, 73, 22, 25, 12, 234234, 4353, 776.

		pn.primeNumber(n);
	}
	
////for custom input, comment below out.
//	public static void main(String[] args) {
//		Prime_Number pn = new Prime_Number();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a Prime number...");
//		int n = scan.nextInt();
//		scan.close();
//		pn.primeNumber(n);
//	}
}

