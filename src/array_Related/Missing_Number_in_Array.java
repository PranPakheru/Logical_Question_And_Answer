package array_Related;

import java.util.Scanner;

//problem statement below...
//Write a program in Java for, In array 1-100 numbers are stored, one number is missing how do you find it.
public class Missing_Number_in_Array {
	
	
	public int missingElement(int[] arr) {
		int n = arr.length+1;
		int totalElements = (n*(n+1))/2;
		int elementsOfArray = 0;
		
		for(int i=0; i<n-1; i++) {
			elementsOfArray += arr[i];
		}
		
		return totalElements-elementsOfArray;
	}
	
	public static void main(String[] args) {
		
		Missing_Number_in_Array missEle = new Missing_Number_in_Array();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of array between 1-100 ...");
		int x = scan.nextInt();
		
		int[] arr = new int[x-1];
		
		System.out.println("Enter " +(x-1) + " continuous elements starting from 1...");
		for(int i=0; i<x-1; i++) {
			System.out.println("enter " +i +"th element." );
			arr[i] = scan.nextInt();
		}
		
		scan.close();
		
		int res = missEle.missingElement(arr);
		System.out.println("The missing element is..." +res);
		
	}
}


//if we have first and last number
//public class Missing_Number_in_Array {
//	
//
//	public int missingElement(int[] arr) {
//		
//		int first = arr[0];
//		int last = arr[arr.length-1];
//		int n = last - first + 1;
//		float totalElements = (n*(last+first))/2;
//		float elementsOfArray = 0.0f;
//		
//		for(int i=0; i<arr.length; i++) {
//			elementsOfArray += arr[i];
//		}
//		
//		return (int)(totalElements-elementsOfArray);
//	}
//	
//	public static void main(String[] args) {
//		
//		Missing_Number_in_Array missEle = new Missing_Number_in_Array();
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the size of array between 1-100 ...");
//		int x = scan.nextInt();
//		
//		int[] arr = new int[x-1];
//		
//		System.out.println("Enter " +(x-1) + " continuous elements and do include first and last element...");
//		for(int i=0; i<x-1; i++) {
//			System.out.println("enter " +i +"th element." );
//			arr[i] = scan.nextInt();
//		}
//		
//		scan.close();
//		
//		int res = missEle.missingElement(arr);
//		System.out.println("The missing element is..." +res);
//		
//	}
//}
