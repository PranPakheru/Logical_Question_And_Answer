package array_Related;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//problem statement below...
//Write a program for, In a array 1-100 exactly one number is duplicate how do you find it.
public class Only_One_Duplicate {

	public int duplicateNumber(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Only_One_Duplicate onlyOne = new Only_One_Duplicate();
		int[] arr = {1, 5, 3, 7, 4, 3, 9, 8, 10, 8};
		int res = onlyOne.duplicateNumber(arr);
		if(res != -1) {
			System.out.println("The duplicate number is- " +res);
		}
		else {
			System.out.println("No duplicate found!");
		}
		
	}
	
//	//for custom input
//	public static void main(String[] args) {
//		
//		Only_One_Duplicate onlyOne = new Only_One_Duplicate();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the size of array...");
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			System.out.println("enter " +i +"th element...");
//			arr[i] = scan.nextInt();
//		}
//		scan.close();
//		
//		int res = onlyOne.duplicateNumber(arr);
//		if(res != -1) {
//			System.out.println("The duplicate number is- " +res);
//		}
//		else {
//			System.out.println("No duplicate found!");
//		}
//		
//	}
	
}


////another approach, by using HashSet
//public class Only_One_Duplicate {
//
//	public int duplicateNumber(int[] arr) {
//		
//		HashSet<Integer> hs = new HashSet<>();
//		
//		for(int num : arr) {
//			if(!hs.add(num)) {
//				return num;
//			}
//		}
//		
//		return -1;
//	}
//	
//	public static void main(String[] args) {
//		
//		Only_One_Duplicate onlyOne = new Only_One_Duplicate();
//		int[] arr = {1, 5, 3, 7, 4, 3, 9, 8, 10, 8};
//		int res = onlyOne.duplicateNumber(arr);
//		if(res != -1) {
//			System.out.println("The duplicate number is- " +res);
//		}
//		else {
//			System.out.println("No duplicate found!");
//		}
//		
//	}
//	
////	//for custom input
////	public static void main(String[] args) {
////		
////		Only_One_Duplicate onlyOne = new Only_One_Duplicate();
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Please enter the size of array...");
////		int n = scan.nextInt();
////		int[] arr = new int[n];
////		
////		for(int i=0; i<n; i++) {
////			System.out.println("enter " +i +"th element...");
////			arr[i] = scan.nextInt();
////		}
////		scan.close();
////		
////		int res = onlyOne.duplicateNumber(arr);
////		if(res == -1) {
////			System.out.println("No duplicate found!");
////		}
////		else {
////			System.out.println("The duplicate number is- " +res);
////		}
////		
////	}
//	
//}



