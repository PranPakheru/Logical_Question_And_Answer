package array_Related;

import java.util.Scanner;

//problem statement below.
//Write a program in Java to find largest and smallest number in array.

//sorting approach.
public class Largest_Smallest_Number {
	
	public void largestSmallestNumber(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("The Smallest number is: " +arr[0]);
		System.out.println("The Largest number is: " +arr[arr.length-1]);
	}
	
	public static void main(String[] args) {
		Largest_Smallest_Number larSmNum = new Largest_Smallest_Number();
		int[] arr = {2, 4, 3, 1, 5, 6, 7, 5, 6, 7, 8, 9, 10};
		larSmNum.largestSmallestNumber(arr);
	}
	
//	//for custom input
//	public static void main(String[] args) {
//		Largest_Smallest_Number larSmNum = new Largest_Smallest_Number();
//		System.out.println("Please enter the size of array:");
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for(int i=0; i<n; i++) {
//			System.out.println("Please enter " +n +"th number:");
//			arr[i] = scan.nextInt();
//		}
//		scan.close();	
//		larSmNum.largestSmallestNumber(arr);
//	}
}


//another approach
//public class Largest_Smallest_Number {
//	
//	public void largestSmallestNumber(int[] arr) {
//		int smallestNum = arr[0];
//		int largestNum = arr[arr.length-1];
//		int i = 0;
//		while(i < arr.length) {
//			if(smallestNum > arr[i]) {
//				smallestNum = arr[i];
//			}
//			else if(largestNum < arr[i]) {
//				largestNum = arr[i];
//			}
//			i++;
//		}
//		
//		System.out.println("The Smallest number is: " +smallestNum);
//		System.out.println("The Largest number is: " +largestNum);
//	}
//	
//	public static void main(String[] args) {
//		Largest_Smallest_Number larSmNum = new Largest_Smallest_Number();
//		int[] arr = {2, 4, 3, 1, 5, 6, 7, 5, 6, 7, 8, 9, 11, 10, 0, 11, 12};
//		larSmNum.largestSmallestNumber(arr);
//	}
//	
////	//for custom input
////	public static void main(String[] args) {
////		Largest_Smallest_Number larSmNum = new Largest_Smallest_Number();
////		System.out.println("Please enter the size of array:");
////		Scanner scan = new Scanner(System.in);
////		int n = scan.nextInt();
////		int[] arr = new int[n];
////		for(int i=0; i<n; i++) {
////			System.out.println("Please enter " +n +"th number:");
////			arr[i] = scan.nextInt();
////		}
////		larSmNum.largestSmallestNumber(arr);
////	}
//}
