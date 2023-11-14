package array_Related;

import java.util.Arrays;

//problem statement below...
//Write a program for, Given two arrays 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
public class Compare_Arrays {

	public void missingNumber(int[] arr1, int[] arr2) {
		int res = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=i; j<arr2.length; j++) {
				if(arr1[i] != arr2[j]) {
					res = arr1[i];
				}
			}
		}
		System.out.println(res +" is not present.");
	}
	
	public static void main(String[] args) {
		Compare_Arrays compArr = new Compare_Arrays();
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {2, 3, 1, 0, 5};
		
		compArr.missingNumber(arr1, arr2);
	}
}


//another approach
//public class Compare_Arrays {
//
//	public void missingNumber(int[] arr1, int[] arr2) {
//		int res = 0;
//		for(int i=0; i<arr1.length; i++) {
//			res += arr1[i] - arr2[i];
//		}
//		System.out.println(res +" is not present.");
//		
//	}
//	
//	public static void main(String[] args) {
//		Compare_Arrays compArr = new Compare_Arrays();
//		
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = {2, 3, 1, 0, 5};
//		
//		compArr.missingNumber(arr1, arr2);
//	}
//}



