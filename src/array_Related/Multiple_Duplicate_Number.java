package array_Related;

import java.util.Arrays;
import java.util.Scanner;

//problem statement below.
//Write a program in Java for, In a array 1-100 multiple numbers are duplicates, how do you find it.
//testing data {1, 3, 5, 2, 3, 4, 2, 4, 5, 3, 2, 4, 1, 4}

//by using arrays method
public class Multiple_Duplicate_Number {
	
	public void multipleDuplicateNumberInArray(int[] arr) {
		int[] occur = new int[arr.length];
		
		Arrays.fill(occur, 0);
		
		for(int i=0; i<arr.length; i++) {
			occur[arr[i]]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(occur[i]>1) {
				System.out.println("The number " +i +" occured " +occur[i] +" times.");
			}
		}
	}
	
	public static void main(String[] args) {
		Multiple_Duplicate_Number multDup = new Multiple_Duplicate_Number();
		int[] arr = {1, 3, 5, 2, 3, 4, 2, 4, 5, 3, 2, 4, 1, 4};
		multDup.multipleDuplicateNumberInArray(arr);
	}
	
//	//for custom array
//	public static void main(String[] args) {
//		Multiple_Duplicate_Number multDup = new Multiple_Duplicate_Number();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the size of array:");
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for(int i=0; i<n; i++) {
//			System.out.println("Please enter " +i +"th element:");
//			arr[i] = scan.nextInt();
//		}
//		
//		multDup.multipleDuplicateNumberInArray(arr);
//	}
}
