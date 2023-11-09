package array_Related;

import java.util.Scanner;

//problem statement below...
//Write a program for, How to find all pairs in array of integers whose sum is equal to given number.
public class PairOfIntegersEqualsToSum {

	public void equalsSum(int[] arr, int sum) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i] + arr[j]) == sum) {
					System.out.println("The pair is " +arr[i] +", " +arr[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PairOfIntegersEqualsToSum pairSum = new PairOfIntegersEqualsToSum();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 8;
		pairSum.equalsSum(arr, sum);
	}
	
//	//for custom inputs
//	public static void main(String[] args) {
//		PairOfIntegersEqualsToSum pairSum = new PairOfIntegersEqualsToSum();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the length of array...");
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			System.out.println("enter " +i +"th element.");
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.println("Please enter the sum you want to find...");
//		
//		int sum = scan.nextInt();
//		scan.close();
//		pairSum.equalsSum(arr, sum);
//	}
}
