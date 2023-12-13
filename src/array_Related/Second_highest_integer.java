package array_Related;

import java.util.Arrays;

//problem statement below...
//Write a program in Java to find second highest number in an integer array.

public class Second_highest_integer {
	
	
	//without sorting aproach
	public static int secondHighest(int[] arr) {
		
		int highest = -1;
		int secHighest = -2;
		int i = 0;
		
		while(i < arr.length) {
			if(highest < arr[i]) {
				highest = arr[i];
			}
			i++;
		}
		
		for(int j=0; j<arr.length; j++) {
			if(highest != arr[j]) {
				if(secHighest < arr[j]) {
					secHighest = arr[j];
				}
			}
		}
		
		return secHighest;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};	//can give any array here.
		int res = Second_highest_integer.secondHighest(arr);  //7 is the second highest.
		System.out.println(res);
	}
}


//sorting approach
//public class Second_highest_integer {
//	
//	
//	//sorting aproach
//	public static int secondHighest(int[] arr) {
//		
//		Arrays.sort(arr);
//		int highest = arr[arr.length-1];
//		int secHigh = -1;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(highest != arr[i]) {
//				if(secHigh < arr[i]) {
//					secHigh = arr[i];
//				}
//			}
//		}
//		
//		return secHigh;
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8,};	//can give any array here.
//		int res = Second_highest_integer.secondHighest(arr);  //7 is the second highest.
//		System.out.println(res);
//	}
//}
