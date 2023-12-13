package number_Related;

import java.util.Scanner;

//problem statement below...
//Write a program in Java to find greatest among three integers.

public class Greatest_amongst_three {
	
	public static int biggestInThree(int x, int y, int z) {
		if( x == y && x == z) {
			return -1;
		}
		else {
			if(x >= y && x >= z) {
				return x;
			}
			else if(y >= x && y >= z) {
				return y;
			}
			else {
				return z;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int res = Greatest_amongst_three.biggestInThree(6, 7, 8);
		if(res == -1) {
			System.out.println("All numbers are equal.");
		}
		else {
			System.out.println(res +" is the greatest number.");
		}
	}
	
	//for custom inputs
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the first number");
//		int x = scan.nextInt();
//		System.out.println("Please enter the second number");
//		int y = scan.nextInt();
//		System.out.println("Please enter the third number");
//		int z = scan.nextInt();
//		scan.close();
//		
//		int res = Greatest_amongst_three.biggestInThree(x, y, z);
//		if(res == -1) {
//			System.out.println("All numbers are equal.");
//		}
//		else {
//			System.out.println(res +" is the greatest number.");
//		}
//	}
}
