package number_Related;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//problem statement below...
//Write a program in Java to find prime factors of a given integer.

public class Prime_factor {
	
	

	public static Set<Integer> primeFactor(int n) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		if(n == 0) {
			set.add(n);
			return set;
		}
		else if(n == 1) {
			set.add(n);
			return set;
		}
		else {
			for(int i=2; i<=n; i++) {
				if(n%i == 0) {
					set.add(i);
					n /= i;
				}
			}
			return set;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int n = scan.nextInt();
		scan.close();
		
		Set<Integer> set = Prime_factor.primeFactor(n);
		
		System.out.println("The prime factor of " +n +" are: ");
		for(int m : set) {
			System.out.print(m +" ");
		}
	}
}
